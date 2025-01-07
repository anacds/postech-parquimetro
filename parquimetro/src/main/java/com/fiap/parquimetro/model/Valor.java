package com.fiap.parquimetro.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Valor {
    private BigDecimal valor;
    private String moeda;
}