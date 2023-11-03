package com.TCC.controleTorcidas.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(OcorrenciaId.class)
public class Ocorrencia {

	@Id
	private Long   id_num_cpf; 
	
	@Id
	private Long   id_ocorrencia;
	
	

	private Date   data_hora;
	private String desc_local;
	private String desc_ocorrencia;
	private Long   id_medida;
	private Date   data_ini;
	private Date   data_fim;
	
	public Ocorrencia(){
		
	}
	
	
	public Long getId_briga() {
		return id_ocorrencia;
	}
	public void setId_briga(Long id_briga) {
		this.id_ocorrencia = id_briga;
	}
	public Long getId_num_cpf() {
		return id_num_cpf;
	}
	public void setId_num_cpf(Long id_num_cpf) {
		this.id_num_cpf = id_num_cpf;
	}
	public Date getData_hora() {
		return data_hora;
	}
	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
	public String getDesc_local() {
		return desc_local;
	}
	public void setDesc_local(String desc_local) {
		this.desc_local = desc_local;
	}
	public String getDesc_ocorrencia() {
		return desc_ocorrencia;
	}
	public void setDesc_ocorrencia(String desc_ocorrencia) {
		this.desc_ocorrencia = desc_ocorrencia;
	}
	public Long getId_medida() {
		return id_medida;
	}
	public void setId_medida(Long id_medida) {
		this.id_medida = id_medida;
	}
	public Date getData_ini() {
		return data_ini;
	}
	public void setData_ini(Date data_ini) {
		this.data_ini = data_ini;
	}
	public Date getData_fim() {
		return data_fim;
	}
	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}
	
	
}
