package com.grupo29.hackathon.model.opcionais;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Opcionais {
    List<Servico> servicos;
    List<Consumivel> consumiveis;

    public BigDecimal getTotalOpcionais() {
        BigDecimal totalServicos = servicos.stream().map(Servico::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal totalConsumiveis = servicos.stream().map(Servico::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return totalServicos.add(totalConsumiveis);
    }
}
