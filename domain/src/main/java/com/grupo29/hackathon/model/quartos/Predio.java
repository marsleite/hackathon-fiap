package com.grupo29.hackathon.model.quartos;

import lombok.Data;

import java.util.List;

@Data
public class Predio {
    private Long id;
    private Localidade localidade;
    private List<Quarto> quartos;
}
