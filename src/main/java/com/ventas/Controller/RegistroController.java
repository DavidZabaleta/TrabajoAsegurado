package com.ventas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ventas.service.ProvedorService;

@Controller("RegistroController")
@RequestMapping("/crud")
public class RegistroController {
	
	private ProvedorService provedorService;

}
