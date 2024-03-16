package com.grupo29.hackathon.resource.entity.opcionais;

import com.grupo29.hackathon.model.opcionais.Opcionais;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class OpcionaisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    List<ConsumivelEntity> consumiveis;

    @OneToMany
    List<ServicoEntity> servicos;

    public Opcionais toDomain() {
        return Opcionais.builder().build();
    }
}
