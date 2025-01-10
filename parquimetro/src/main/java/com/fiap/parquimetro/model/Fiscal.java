package com.fiap.parquimetro.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.Data;

@Document(collection = "Fiscal")
@Data
public class Fiscal {
	
	
	@Id
	@JsonProperty("id") 
	private String id;	
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("cpf")
	private Long cpf;
	
	@JsonProperty("cnpj")
	private Long cnpj;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("numeroCelular")
	private Long numeroCelular;
	
	@CreatedDate
	@JsonProperty("dataCriacao")
    private LocalDateTime dataCriacao;
	
	@LastModifiedDate
	@JsonProperty("dataUltimaAtualização")
    private LocalDateTime dataUltimaAtualização;
		

	public Long getCpf() {
		return cpf;
	}
	
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}


	public String getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getCnpj() {
		return cnpj;
	}


	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getNumeroCelular() {
		return numeroCelular;
	}


	public void setNumeroCelular(Long numeroCelular) {
		this.numeroCelular = numeroCelular;
	}




}
