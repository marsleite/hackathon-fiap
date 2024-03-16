package com.grupo29.hackathon.model.quartos;

import lombok.*;

@Data
@Builder
public class Endereco {
    private Long id;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

}
