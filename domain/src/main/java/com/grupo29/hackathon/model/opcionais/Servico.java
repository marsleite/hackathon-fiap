package com.grupo29.hackathon.model.opcionais;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Servico {
    private String nome;
    private BigDecimal valor;
}
