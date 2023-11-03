package com.TCC.controleTorcidas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Time {
	
	@Id 										      
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TIME_JAVA")
    @SequenceGenerator(name = "SEQ_TIME_JAVA", sequenceName = "SEQ_TIME", allocationSize = 1)// Incrementa automaticamente		
	private Long   id_time;
	
	private String nome_time;
	private Long   id_cidade;
	private Long   id_estado;
	private Long   id_pais;
	
	public Time() {
		
	}
	 

	public Long getId_time() {
		return id_time;
	}

 

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome_time) {
		this.nome_time = nome_time;
	}

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
	
	
	
	

}
