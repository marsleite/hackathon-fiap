package com.grupo29.hackathon.model.quartos;

import lombok.Data;

import java.util.List;

@Data
public class Localidade {
    private String nome;
    private String endereco;
    private List<Amenidade> amenidades;
    private List<Predio> predios;
}
