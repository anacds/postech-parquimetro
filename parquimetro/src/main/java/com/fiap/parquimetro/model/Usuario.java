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
public class Usuario{	

	@Id
	@JsonProperty("id") //tive que usar "JsonProperty" sem ele ficava tudo "null".. n sei pq..
	private String id;	
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("cpf")
	private Long cpf;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("numeroCelular")
	private Long numeroCelular;
	
	@JsonProperty("placasCarro")
    private Set<String> placasCarro = new HashSet<>(); //  HashSet para evitar duplicatas
	
	@JsonProperty("preferencias")
    private Preferencias preferencias; 
	
	@CreatedDate
	@JsonProperty("dataCriacao")
    private LocalDateTime dataCriacao;
	
	@LastModifiedDate
	@JsonProperty("dataUltimaAtualização")
    private LocalDateTime dataUltimaAtualização;
	
	 // Getters e setters da Preferencias
    public Preferencias getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(Preferencias preferencias) {
        this.preferencias = preferencias;
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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
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

	public Set<String> getPlacasCarro() {
		return placasCarro;
	}

	public void setPlacasCarro(Set<String> placasCarro) {
		this.placasCarro = placasCarro;
	}

    
	
		
    
}

