package com.TCC.controleTorcidas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Estado {
	
	//Contrutor
	public Estado() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESTADO_JAVA")
    @SequenceGenerator(name = "SEQ_ESTADO_JAVA", sequenceName = "SEQ_ESTADO", allocationSize = 1)// Incrementa automaticamente
	private Long      id_estado;
	private Long 	  id_pais;
	private String    nome_estado;
	private String 	  uf;
	
	public Long getId_estado() {
		return id_estado;
	}
	public void setId_estado(Long id_estado) {
		this.id_estado = id_estado;
	}
	public Long getId_pais() {
		return id_pais;
	}
	public void setId_pais(Long id_pais) {
		this.id_pais = id_pais;
	}
	public String getNome_estado() {
		return nome_estado;
	}
	public void setNome_estado(String nome_estado) {
		this.nome_estado = nome_estado;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	

}
