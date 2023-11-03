package com.TCC.controleTorcidas.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCC.controleTorcidas.model.IOcorrenciaRepository;
import com.TCC.controleTorcidas.model.Ocorrencia;
import com.TCC.controleTorcidas.utils.ValidadorCpf;

@Service
public class OcorrenciaService {

	@Autowired
	IOcorrenciaRepository rep;
	
	@Autowired
	ValidadorCpf		  cpf;	
	
	public List<Ocorrencia> getOcorrenciasCpf(Long id_cpf) {
		return rep.findByIdCpf(id_cpf);		
	}
	

	public String postOcorrencia(Ocorrencia ocorrencia) {
		
		if (ocorrencia.getId_num_cpf() != null && cpf.validaCpf(ocorrencia.getId_num_cpf().toString())) {
	        rep.save(ocorrencia);
	        return "Ocorrencia registrada";
	    } else {
	        return "CPF inválido ou nulo";
	    }
		
	}
	
	//Consulta se há ocorrencias para o CPF, se houver e estiverem dentro do periodo de vigencia, 
	// o cpf é retornado como bloqueado
	public Map<String, String> getValidaBloqueio(Long cpf) {
		
		List<Ocorrencia>  ocorrencias = rep.findByIdCpf(cpf);				
		Date dataAtual = new Date();		
		Map<String,String> resultado = new HashMap<>();
		
		for (Ocorrencia ocorrencia : ocorrencias ) {
			
			if(dataAtual.after(ocorrencia.getData_ini()) && 
			   dataAtual.before(ocorrencia.getData_fim())) {
				
				resultado.put("STATUS","Bloqueado" );
				resultado.put("CPF"   ,ocorrencia.getId_num_cpf().toString());											
			}else {
				resultado.put("STATUS","Liberado" );
				resultado.put("CPF"   ,ocorrencia.getId_num_cpf().toString());	
			}			
		}				
		return resultado;
	} 	
}
