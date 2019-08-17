package com.ventas.validaciones;

import org.springframework.stereotype.Component;

@Component
public class DireccionV {
	
	public void direccion(String direccion) {
        String newDireccion = direccion.toUpperCase();
        int countVocales = 0;
        Character cLetra = 'C';
        Character lLetra = 'L';
        
        char[] charDireccion = newDireccion.toCharArray();
        
        if ((charDireccion[0] == cLetra) && (charDireccion[1] == lLetra)) {
        	
			for (int i = 0; i < direccion.length(); i++) {
				
				if(direccion.charAt(i) == 'a' ||direccion.charAt(i) == 'e' ||direccion.charAt(i) == 'i' ||direccion.charAt(i) == 'o' ||direccion.charAt(i) == 'u') {					
					countVocales++;					
				}
			}
			
			if (countVocales != 3) {
				System.out.println("no son 3 vocales");
			}else {
				System.out.println("3 vocales");
			}
			
		}else {
			System.out.println("Direccion no valida.");
		}
        
	}

}
