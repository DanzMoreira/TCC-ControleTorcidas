package com.TCC.controleTorcidas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TCC.controleTorcidas.model.Estado;
import com.TCC.controleTorcidas.service.EstadoService;

@RestController
@RequestMapping("/estado")
public class EstadoController {
	
	@Autowired
	EstadoService service; 
	
	
	@GetMapping("/{id}")
	public Optional<Estado> getEstadoById(@PathVariable("id") Long id_estado) {		
		return service.getEstadoById(id_estado);
	}
	
	@GetMapping()
	public Iterable<Estado> getEstado() {		
		return service.getEstado();
	}
	
	@PostMapping()
	public void insereEstado(@RequestBody Estado estado ) {	
		 service.insereEstado(estado);
		
	}
	
	@PostMapping("/cargaEstado")
	public void cargaEstado(@RequestBody List<Estado> estado) {		
		service.cargaEstado(estado);		
	}
	

}
