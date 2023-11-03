package com.TCC.controleTorcidas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCC.controleTorcidas.model.Cidade;
import com.TCC.controleTorcidas.model.ICidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private ICidadeRepository  rep;
	
	
	public Optional<Cidade> getCidadeById(Long id_cidade) {
		
		return rep.findById(id_cidade);		
	}
	
	public Iterable<Cidade> getCidade() {
		
		return rep.findAll();		
	}
	
	public void postCidade(Cidade cidade) {
		
		rep.save(cidade);		
	}
	
	public void cargaCidade(List<Cidade> cidade) {
		
		rep.saveAll(cidade);		
	}	
	
	
	
}
