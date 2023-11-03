package com.TCC.controleTorcidas.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TCC.controleTorcidas.service.DeleteService;
 

@RestController
@RequestMapping("/delete")
public class DeleteController {

	@Autowired
	private DeleteService service; 
	
	
	@DeleteMapping("/{cpf}")
	public String delCpf(@PathVariable("cpf")Long cpf ) {
		
		if (service.delCpf(cpf)) {
            return "success";
        } else {
            return "failed";
        } 
	} 	
	
	@DeleteMapping("/{cpf}/{ocorrencia}")
	public String delOcorrencia(@PathVariable("cpf")Long cpf, @PathVariable("ocorrencia")Long ocorrencia) {
		
		if (service.delOcorrencia(cpf,ocorrencia)) {
            return "success";
        } else {
            return "failed";
        } 
	}
}
