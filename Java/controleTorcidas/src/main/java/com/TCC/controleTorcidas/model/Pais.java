package com.TCC.controleTorcidas.model;

import jakarta.persistence.*;
//Indica que é uma tabela do meu banco
@Entity  
public class Pais {
	
	public Pais() {
			
		}
	//construtor com parametros
	public Pais(Long id_pais, String nome_pais) {
		this.id_pais   = id_pais; 
		this.nome_pais = nome_pais;		
	}
	

	@Id 										       //Indica que é a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PAIS_JAVA")
    @SequenceGenerator(name = "SEQ_PAIS_JAVA", sequenceName = "SEQ_PAIS", allocationSize = 1)// Incrementa automaticamente
	private Long   id_pais   ;
	
	private String nome_pais ;
	
	private String abrev_pais;	
	
	public Long getId_pais() {
		return id_pais;
	}
	public void setId_pais(Long id_pais) {
		this.id_pais = id_pais;
	}
	public String getNome_pais() {
		return nome_pais;
	}
	public void setNome_pais(String nome_pais) {
		this.nome_pais = nome_pais;
	}
	public String getAbrev_pais() {
		return abrev_pais;
	}
	public void setAbrev_pais(String abrev_pais) {
		this.abrev_pais = abrev_pais;
	}


}

