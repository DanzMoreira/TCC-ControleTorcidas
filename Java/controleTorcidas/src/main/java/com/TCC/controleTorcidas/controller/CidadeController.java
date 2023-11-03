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

import com.TCC.controleTorcidas.model.Cidade;
import com.TCC.controleTorcidas.service.CidadeService;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

	@Autowired
	private CidadeService service;
	
	@GetMapping("/{id}")
	public Optional<Cidade> getCidadeById(@PathVariable("id")Long id_cidade) {		
		return service.getCidadeById(id_cidade);		
	}
	
	@GetMapping
	public Iterable<Cidade> getCidade() {		
		return service.getCidade();		
	}
	
	@PostMapping
	public void PostCidade(@RequestBody Cidade cidade) {		
		service.postCidade(cidade);		
	}
	
	@PostMapping("/cargaCidade")
	public void cargaCidade(@RequestBody List<Cidade> cidade) {		
		service.cargaCidade(cidade);		
	}	
	
	
}
