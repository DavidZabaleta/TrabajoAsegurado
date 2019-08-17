package com.ventas.service;


import com.ventas.Entity.ProvedorEntity;
import com.ventas.VO.ProvedorVO;

public interface ProvedorService {
	
	ProvedorEntity FindById(long id);
	
	void save(ProvedorEntity provedorEntity);
	
	void save(ProvedorVO provedorVO);
	

}
