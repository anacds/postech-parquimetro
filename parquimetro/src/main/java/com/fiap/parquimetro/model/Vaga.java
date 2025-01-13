package com.fiap.parquimetro.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document("Vaga")
@Data
public class Vaga {
	
	@Id
	private String id;
	@DBRef
	private Regiao regiao;
	private String regiaoId;
	private int numero;
	private boolean disponivel;
	private Localizacao localizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataUltimaAtualizacao;
}
