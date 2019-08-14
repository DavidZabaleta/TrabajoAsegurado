package com.ventas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller("IndexController")
@RequestMapping("/crud")
public class IndexController {
	
	private static final String VIEW = "Index";
	
	@GetMapping("/Index")
	public ModelAndView ShowIndex() {
		ModelAndView view = new ModelAndView(VIEW);
		return view;
	}

}
