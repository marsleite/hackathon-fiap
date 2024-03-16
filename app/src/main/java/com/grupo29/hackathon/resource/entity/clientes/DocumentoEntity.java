package com.grupo29.hackathon.resource.entity.clientes;

import com.grupo29.hackathon.model.clientes.TipoDocumento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class DocumentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private TipoDocumento tipoDocumento;
    private String numeroDocumento;

}
