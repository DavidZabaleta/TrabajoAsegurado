package com.ventas.utilconverter;

import org.springframework.stereotype.Component;

import com.ventas.Entity.ProvedorEntity;
import com.ventas.VO.ProvedorVO;

@Component
public class ProvedorConverter {
	
	public ProvedorEntity modelToEntity(ProvedorVO provedorVO) {
		ProvedorEntity provedorentity = null;
		if(provedorVO != null) {
			provedorentity =new ProvedorEntity();
			provedorentity.setId(provedorVO.getId());
			provedorentity.setNombre(provedorVO.getNombre());
			provedorentity.setFechaRegistro(provedorVO.getFechaRegistro());
			provedorentity.setTelefono(provedorVO.getTelefono());
			provedorentity.setDireccion(provedorVO.getDireccion());
		}
		return provedorentity;
		
	}

}
