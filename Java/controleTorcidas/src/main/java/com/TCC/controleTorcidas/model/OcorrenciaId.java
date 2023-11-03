package com.TCC.controleTorcidas.model;

import java.io.Serializable;

public class OcorrenciaId implements Serializable{
	
	private Long id_num_cpf;
    private Long id_ocorrencia;

    
    public Long getId_num_cpf() {
		return id_num_cpf;
	}
	public void setId_num_cpf(Long id_num_cpf) {
		this.id_num_cpf = id_num_cpf;
	}
	public Long getId_ocorrencia() {
		return id_ocorrencia;
	}
	public void setId_ocorrencia(Long id_ocorrencia) {
		this.id_ocorrencia = id_ocorrencia;
	}

}
