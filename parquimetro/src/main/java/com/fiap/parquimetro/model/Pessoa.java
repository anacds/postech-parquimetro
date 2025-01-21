package com.fiap.parquimetro.model;


import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Pessoa {


    private String nome;
    private String email;
    private Long cpf;
    private String numeroCelular;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataUltimaAtualizacao;
    



   

}
