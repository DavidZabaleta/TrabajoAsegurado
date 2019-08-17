package com.ventas.validaciones;

import org.springframework.stereotype.Component;

@Component
public class Palindroma {
	
	public boolean palindrome(String nombre) {
		
		String lowerNombre = nombre.toLowerCase();
		String newNombre = lowerNombre.replace(" ", "");
        char[] charNombre = newNombre.toCharArray();
        int inicial = 0;
        int descendiente = charNombre.length-1;
        boolean palindromo = false;
        
        while((inicial<descendiente) && (palindromo == false)) {
        	if (charNombre[inicial] == charNombre[descendiente]) {
				inicial++;
				descendiente--;
			}
        	else {
        		palindromo = true;
        	}
        }
        return palindromo;
	}
}
