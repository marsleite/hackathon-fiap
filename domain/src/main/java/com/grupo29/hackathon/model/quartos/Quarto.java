package com.grupo29.hackathon.model.quartos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Quarto {
    private Localidade localidade;
    private Predio predio;
    private TipoQuarto tipoQuarto;
    private BigDecimal valorDiaria;
}
