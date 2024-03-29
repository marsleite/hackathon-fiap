package com.grupo29.hackathon.model.quartos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Localidade {
    private Long id;
    private String nome;
    private Endereco endereco;
    private List<Amenidade> amenidades;
    private List<Predio> predios;
}
