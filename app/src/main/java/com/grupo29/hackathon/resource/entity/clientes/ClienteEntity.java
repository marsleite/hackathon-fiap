package com.grupo29.hackathon.resource.entity.clientes;

import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.model.clientes.Documento;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String paisDeOrigem;

    @OneToOne
    private DocumentoEntity documento;

    private LocalDate dataNascimento;
    private String endereco;
    private String telefone;
    private String email;

    public ClienteEntity(DocumentoEntity documentoEntity, Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.paisDeOrigem = cliente.getPaisDeOrigem();
        this.documento = documentoEntity;
        this.dataNascimento = cliente.getDataNascimento();
        this.endereco = cliente.getEndereco();
        this.telefone = cliente.getTelefone();
        this.email = cliente.getEmail();
    }

    public Cliente toDomain() {
        return Cliente.builder().build();
    }

}
