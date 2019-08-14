package com.ventas.service;


import com.ventas.Entity.ProvedorEntity;

public interface ProvedorService {
	
	ProvedorEntity FindById(long id);
	
	void save(ProvedorEntity provedorEntity);
	

}
