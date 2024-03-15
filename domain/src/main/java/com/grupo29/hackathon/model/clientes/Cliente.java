package com.grupo29.hackathon.model.clientes;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class Cliente {
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String paisDeOrigem;
    @NotNull
    private Documento documento;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private String endereco;
    @NotNull
    private String telefone;
    @NotNull
    private String email;
}
