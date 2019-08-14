package com.ventas.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ventas.Entity.ProvedorEntity;
import com.ventas.Repository.ProvedorRepository;
import com.ventas.service.ProvedorService;

@Service("ProvedorServiceImpl")
public class ProvedorServiceImpl implements ProvedorService {

	@Autowired
	@Qualifier("ProvedorRepository")
	private ProvedorRepository provedorrepository;
	

	@Override
	public void save(ProvedorEntity provedorEntity) {
		provedorrepository.save(provedorEntity);
		
	}

	@Override
	public ProvedorEntity FindById(long id) {
		return provedorrepository.findById(id).orElse(null);
	}

}
