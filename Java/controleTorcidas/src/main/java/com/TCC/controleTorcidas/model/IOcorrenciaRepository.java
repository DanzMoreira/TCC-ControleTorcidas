package com.TCC.controleTorcidas.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IOcorrenciaRepository extends CrudRepository<Ocorrencia, Long>{
	
	@Query("SELECT o FROM Ocorrencia o WHERE o.id_num_cpf = ?1")
	List<Ocorrencia> findByIdCpf(Long cpf);
	
 
}
