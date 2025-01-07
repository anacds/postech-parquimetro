package com.fiap.parquimetro.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document
@Data
public class Vaga {
	
	@Id
	private String id;
	//TODO: Classe de região e sua composição nessa classe.
	private int numero;
	private boolean disponivel;
	private String localizacao;
}
