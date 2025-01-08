package com.fiap.parquimetro.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "pessoas") 
public class Pessoa {


    private String cpf;
    private String nome;
    private String email;
    private String placa;
    private String numeroCelular;
    private List<String> placasCarro;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataUltimaAtualizacao;
    private Preferencias preferencias;

    public Pessoa(String cpf, String nome, String email, String placa, String numeroCelular,
                  List<String> placasCarro, Preferencias preferencias) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.placa = placa;
        this.numeroCelular = numeroCelular;
        this.placasCarro = placasCarro;
        this.dataCriacao = LocalDateTime.now();
        this.dataUltimaAtualizacao = LocalDateTime.now();
        this.preferencias = preferencias;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public List<String> getPlacasCarro() {
        return placasCarro;
    }

    public void setPlacasCarro(List<String> placasCarro) {
        this.placasCarro = placasCarro;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public Preferencias getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(Preferencias preferencias) {
        this.preferencias = preferencias;
    }

    public void atualizar() {
        this.dataUltimaAtualizacao = LocalDateTime.now();
    }

}