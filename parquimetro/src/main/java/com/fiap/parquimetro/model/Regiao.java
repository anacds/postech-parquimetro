package com.fiap.parquimetro.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Regiao")
@Data
public class Regiao {

	@Id
	private String id;
	private String nome;
	private String descricao;
	private String zona;
	private int tempoToleranciaMinutos;
	private Double valorTarifa;
	private String moeda;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUltimaAtualizacao;
}
