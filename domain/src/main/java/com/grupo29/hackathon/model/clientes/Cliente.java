package com.grupo29.hackathon.model.clientes;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
