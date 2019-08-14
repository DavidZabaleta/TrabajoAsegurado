package com.ventas.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.Entity.ProvedorEntity;
import com.ventas.service.ProvedorService;






@RestController("ProvedorWS")
@RequestMapping("/provedor-service")
public class ProvedorWS {
	
	@Autowired
	@Qualifier("ProvedorServiceImpl")
	private ProvedorService provedorService;
	

	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void crear(@RequestBody ProvedorEntity provedor) {
		provedorService.save(provedor);
	}
	
	@PutMapping("/actualizar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update( @PathVariable long id, @RequestBody ProvedorEntity provedor) {
		provedor.setId(id);
		provedorService.save(provedor);
	}
	
	@GetMapping("/persona/{id}")
	public ProvedorEntity findById(@PathVariable long id) {
		return  provedorService.FindById(id);
	}

}
