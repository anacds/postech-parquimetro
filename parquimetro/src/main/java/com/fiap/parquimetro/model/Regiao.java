package com.fiap.parquimetro.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Regiao")
@Getter
@Setter
public class Regiao {
	@Id
	private String id;
	private String nome;
	private String descricao;
	private String zona;
	private int tempoToleranciaMinutos;
	private Valor tarifaPorMinuto;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUltimaAtualizacao;
}
