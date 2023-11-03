package com.TCC.controleTorcidas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCC.controleTorcidas.model.IPessoaRepository;
import com.TCC.controleTorcidas.model.Pessoa;
import com.TCC.controleTorcidas.utils.ValidadorCpf;

@Service
public class PessoaService {
	
	@Autowired
	private IPessoaRepository rep;
	
	@Autowired
	ValidadorCpf  cpf;
	
	public Optional<Pessoa> getPessoaById (Long id_num_cpf) {
		return rep.findById(id_num_cpf);
		
	}
	
	public Iterable<Pessoa> getPessoas () {
		return rep.findAll();
		
	}
	
	public String postPessoaById (Pessoa pessoa) {
		
		if (cpf.validaCpf(pessoa.getId_num_cpf().toString())) {
			rep.save(pessoa);
			return "Pessoa inserida";
		}else {
			return "CPF inválido";
		}					
	}
	
	public List<Pessoa> postPessoas (List<Pessoa> pessoas) {
		List<Pessoa> pessoaCpfInv = new ArrayList<>();
				
		for (Pessoa pessoa : pessoas) {
			//Valida se cpf é valido
			if(cpf.validaCpf(pessoa.getId_num_cpf().toString())) {				
				rep.save(pessoa);
			}else {
				//se nao for valido adiciona a lista
				pessoaCpfInv.add(pessoa);
			}
		}
		return pessoaCpfInv;
	}	
	
	
	
	
	
	
	
	
}
