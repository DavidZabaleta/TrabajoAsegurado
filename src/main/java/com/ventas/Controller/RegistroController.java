package com.ventas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ventas.Entity.ProvedorEntity;
import com.ventas.VO.ProvedorVO;
import com.ventas.service.ProvedorService;
import com.ventas.validaciones.DireccionV;
import com.ventas.validaciones.Palindroma;



@Controller("RegistroController")
@RequestMapping("/crud")
public class RegistroController {

	private static final String VIEW = "registro";
	
	@Autowired
	private ProvedorService provedorservice;
	
	@Autowired
	private DireccionV direccionn;
	
	@Autowired
	private Palindroma pal;
	
	@GetMapping("/registro")
	public ModelAndView showcrear() {
		ModelAndView view = new ModelAndView(VIEW);
		view.addObject("Provedor", new ProvedorVO());
		return view;
	}
	
	@PostMapping("/insertarProvedor")
	public Object insertar(@ModelAttribute("Provedor") ProvedorVO provedor) {
		Object retorno = null;
		try {
			boolean verificarpalindrome=true;
			verificarpalindrome = pal.palindrome(provedor.getNombre());
			if(verificarpalindrome==false) {
				System.out.println("si es palindroma");
				retorno = new RedirectView("/crud/index");
				
			}else {
				System.out.println("no es palindroma");
				provedorservice.save(provedor);
				retorno = new RedirectView("/crud/index");
			}
			
			direccionn.direccion(provedor.getDireccion());
			
			
		} catch (Exception e) {
			ModelAndView view = new ModelAndView(VIEW);
			retorno=view;
			view.addObject("provedor", provedor);
			view.addObject("validationError", e.getMessage().toString());
			retorno = view;
		}
		return retorno;
	}

}
