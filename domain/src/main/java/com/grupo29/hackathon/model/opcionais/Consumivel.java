package com.grupo29.hackathon.model.opcionais;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Consumivel {
    private String nome;
    private BigDecimal valor;
}
