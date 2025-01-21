package com.fiap.parquimetro.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Document(collection = "Usuario")
@Data
public class Usuario extends Pessoa{	

	@Id
	private String id;	

	@JsonProperty("placasCarro")
    private Set<String> placasCarro = new HashSet<>(); //  HashSet para evitar duplicatas
	
	@JsonProperty("preferencias")
    private Preferencias preferencias; 
	
	
		
    
}

