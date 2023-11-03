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

import com.TCC.controleTorcidas.model.Pessoa;
import com.TCC.controleTorcidas.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	PessoaService service;
	
	
	@GetMapping("/{id}")
	public Optional<Pessoa> getPessoa(@PathVariable("id")Long cpf) {		
		return service.getPessoaById(cpf);
	}
	
	@GetMapping
	public Iterable<Pessoa> getPessoas() {		
		return service.getPessoas();
	}	
	
	@PostMapping
	public String postPessoa(@RequestBody Pessoa pessoa) {	
		return service.postPessoaById(pessoa);
	}	
	
	@PostMapping("/cargaPessoas")
	public Iterable<Pessoa> postPessoas(@RequestBody List<Pessoa> pessoas) {			
		return service.postPessoas(pessoas);
	}
}
