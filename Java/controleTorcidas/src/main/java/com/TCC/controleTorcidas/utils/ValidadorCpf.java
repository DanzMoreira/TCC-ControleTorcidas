package com.TCC.controleTorcidas.utils;

import org.springframework.stereotype.Service;

@Service 
public class ValidadorCpf {
	
	public boolean validaCpf(String cpf) {
		  int digito1 =0;
		  int digito2 =0;	  
		  int r	      =0;
		  
		    if (cpf == null || !cpf.matches("\\d{11}") || cpf.equals("00000000000")){
		    	return false;
		    }
		  
		    //calculo digito 1  
			for (int i = 0; i<9; i++) {
				digito1 += Character.getNumericValue(cpf.charAt(i)) * (10-i) ;
			}
			
			r = digito1%11;
			
			if (r == 0 || r == 1) {
				digito1 = 0;			
			} else {
				digito1 = 11 -r;
			}		
			
			//calculo digito 2
			for (int i = 1; i<10; i++) {
				digito2 += Character.getNumericValue(cpf.charAt(i)) * (11-i) ;
			}
			r = digito2%11;
			
			if (r == 0 || r == 1) {
				digito2 = 0;			
			} else {
				digito2 = 11 -r;
			}		

			if ((Character.getNumericValue(cpf.charAt(9) )== digito1) && 
			    (Character.getNumericValue(cpf.charAt(10))== digito2)){
				return true;
			}else {
				return false;
			}
		}

}
