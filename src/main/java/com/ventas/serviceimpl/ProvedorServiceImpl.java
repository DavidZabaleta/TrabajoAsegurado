package com.ventas.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ventas.Entity.ProvedorEntity;
import com.ventas.Repository.ProvedorRepository;
import com.ventas.VO.ProvedorVO;
import com.ventas.service.ProvedorService;
import com.ventas.utilconverter.ProvedorConverter;
import com.ventas.validaciones.DireccionV;
import com.ventas.validaciones.Palindroma;

@Service("ProvedorServiceImpl")
public class ProvedorServiceImpl implements ProvedorService {

	@Autowired
	@Qualifier("ProvedorRepository")
	private ProvedorRepository provedorrepository;
	
	@Autowired
	private ProvedorConverter provedorconverter;
	
	@Autowired
	private Palindroma pal;
	@Autowired
	private DireccionV direcion;
	

	@Override
	public void save(ProvedorEntity provedorEntity) {
		provedorrepository.save(provedorEntity);
		
	}

	@Override
	public ProvedorEntity FindById(long id) {
		return provedorrepository.findById(id).orElse(null);
	}

	@Override
	public void save(ProvedorVO provedorVO) {
		 provedorrepository.save(provedorconverter.modelToEntity(provedorVO));
		
	}

}
