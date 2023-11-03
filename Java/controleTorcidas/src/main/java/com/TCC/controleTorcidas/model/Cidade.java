package com.TCC.controleTorcidas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cidade {

	
	public Cidade() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CIDADE_JAVA")
    @SequenceGenerator(name = "SEQ_CIDADE_JAVA", sequenceName = "SEQ_CIDADE", allocationSize = 1)// Incrementa automaticamente	
	private Long   id_cidade ;
	private Long   id_estado ;
	private Long   id_pais   ;
	private String nom_cidade;
	

	
	
	public Long getId_cidade() {
		return id_cidade;
	}
	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}
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
	public String getNom_cidade() {
		return nom_cidade;
	}
	public void setNom_cidade(String nom_cidade) {
		this.nom_cidade = nom_cidade;
	}

	
}
