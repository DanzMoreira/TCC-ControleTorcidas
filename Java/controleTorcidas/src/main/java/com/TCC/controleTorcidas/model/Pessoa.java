package com.TCC.controleTorcidas.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

	@Id
	private Long 	id_num_cpf 	;
	
	private String 	nome_pessoa ;	
	private Date 	data_nasc 	;
	private String 	endereco 	;	
	private String 	email 		;
	private Long 	ddd 		;	
	private Long 	telefone 	;	
	private String 	genero 		;
	private Long 	id_time 	;	
	private Long 	id_cidade 	;
	private Long 	id_estado 	;
	private Long 	id_pais 	;
	
	//Construtor
	public Pessoa() {
		
	}
	
	public Long getId_num_cpf() {
		return id_num_cpf;
	}
	public void setId_num_cpf(Long id_num_cpf) {
		this.id_num_cpf = id_num_cpf;
	}
	public String getNome_pessoa() {
		return nome_pessoa;
	}
	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getDdd() {
		return ddd;
	}
	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Long getId_time() {
		return id_time;
	}
	public void setId_time(Long id_time) {
		this.id_time = id_time;
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
