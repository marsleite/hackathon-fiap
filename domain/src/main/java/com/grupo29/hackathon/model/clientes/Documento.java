package com.grupo29.hackathon.model.clientes;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public class Documento {
    @NotNull
    private TipoDocumento tipoDocumento;
    @NotNull
    private String numeroDocumento;
}
