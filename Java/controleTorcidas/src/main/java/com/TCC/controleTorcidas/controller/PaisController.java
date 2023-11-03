package com.TCC.controleTorcidas.controller;

import com.TCC.controleTorcidas.model.Pais;
import com.TCC.controleTorcidas.service.PaisService;

import java.util.List;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController					// indica que essa classe é um controlador de uma API REST.
@RequestMapping("/pais")	    // é usada para mapear URLs de solicitação para métodos em um controlador. 
								// Ela especifica o URI que o método do controlador irá lidar.
public class PaisController {
		
	@Autowired
	private PaisService service;
 	
	//notacao que indica que um método deve ser executado quando uma solicitação GET é feita
	@GetMapping() 				
	public Iterable<Pais> getPaises(){		
		return service.getPaises();
	}
	
	@GetMapping("/{id}") 				
	public Optional<Pais> getPaises(@PathVariable("id") Long id_pais){		
		return service.getPaisById(id_pais);
		
	}	
	
	@PostMapping 
	public void inserePais(@RequestBody Pais pais) {
		service.save(pais);
	}
	
	@PostMapping("/cargaPaises")
	public void cargaPaises(@RequestBody List<Pais> pais) {
		service.save(pais);
	}
	
}