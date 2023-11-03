package com.TCC.controleTorcidas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TCC.controleTorcidas.model.Ocorrencia;
import com.TCC.controleTorcidas.service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
	
	@Autowired
	OcorrenciaService service;
	
	@GetMapping("/{cpf}")
	public List<Ocorrencia> getOcorrenciasCpf(@PathVariable("cpf") Long id_cpf) {					
		return service.getOcorrenciasCpf(id_cpf);		
	}

	@GetMapping("/bloqueio/{cpf}")
	public Map<String,String> getValidaBloqueio(@PathVariable("cpf") Long id_num_cpf) {			
		return service.getValidaBloqueio(id_num_cpf);
	}
		
	@PostMapping("/insereOcorrencia")
	public String postOcorrenciaById(@RequestBody Ocorrencia ocorrencia) {			
		return service.postOcorrencia(ocorrencia);
	}
}
