package com.grupo29.hackathon.model.quartos;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Quarto {
    private Localidade localidade;
    private Predio predio;
    private TipoQuarto tipoQuarto;
    private BigDecimal valorDiaria;


}
