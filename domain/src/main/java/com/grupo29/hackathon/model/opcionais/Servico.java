package com.grupo29.hackathon.model.opcionais;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Servico {
    private String nome;
    private BigDecimal valor;
}
