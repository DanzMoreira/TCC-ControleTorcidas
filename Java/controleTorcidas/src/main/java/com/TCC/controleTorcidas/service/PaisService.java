package com.TCC.controleTorcidas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCC.controleTorcidas.model.IPaisRepository; 
import com.TCC.controleTorcidas.model.Pais;
import java.util.Optional;

import java.util.List; 	     //é uma interface que define o comportamento básico de uma lista. Uma interface em Java 
							 //é um contrato que especifica métodos que uma classe que a implementa deve fornecer
							 
						     //ArrayList
                             //é uma classe que implementa a interface List. É uma implementação dinâmica de uma lista, 
					         //o que significa que você pode adicionar, remover e acessar elementos de maneira flexível.


@Service 
public class PaisService {

	@Autowired 
	private IPaisRepository rep; 
			
	public Iterable<Pais> getPaises(){		
		return rep.findAll();
	}
		
	public Optional<Pais> getPaisById(Long id_pais) {		
		return rep.findById(id_pais);
	}
	
	public void save(Pais pais) {
		rep.save(pais);
	}

	public void save(List<Pais> pais) { 
		rep.saveAll(pais);
	} 
	

}
