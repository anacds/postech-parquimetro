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
public class Fiscal extends Pessoa {
	
	
	@Id
	private String id;	
	
	@JsonProperty("orgao") 
	private String orgao;	

	@JsonProperty("cpf")
	private Long cpf;
	
	@JsonProperty("cnpj")
	private Long cnpj;


	





}
