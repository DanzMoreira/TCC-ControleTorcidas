package com.TCC.controleTorcidas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCC.controleTorcidas.model.Estado;
import com.TCC.controleTorcidas.model.IEstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private IEstadoRepository    rep; 
	
	 public Iterable<Estado> getEstado (){		 
		 return rep.findAll();
		 }	
	 
	 public Optional<Estado> getEstadoById (Long id_estado){		 
		 return rep.findById(id_estado);		 
	 }

	 public void insereEstado(Estado estado){
		 rep.save(estado);		 
	 }
	 
	 public void cargaEstado (List<Estado> estado){		 
		 rep.saveAll(estado);
	 } 
	 
	 

}
