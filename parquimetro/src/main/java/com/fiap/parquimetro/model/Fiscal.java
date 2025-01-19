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

	@JsonProperty("orgao")
	private String orgao;

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






}
