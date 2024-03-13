package com.grupo29.hackathon.resource.repository.entity;

import com.grupo29.hackathon.model.quartos.Localidade;
import com.grupo29.hackathon.model.quartos.Predio;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.quartos.TipoQuarto;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "quarto")
public class QuartoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Localidade localidade;
    private Predio predio;
    private TipoQuarto tipoQuarto;
    private BigDecimal valorDiaria;



    public Quarto toDomain() {
        return Quarto.builder()
                .localidade(this.localidade)
                .predio(this.predio)
                .tipoQuarto(this.tipoQuarto)
                .valorDiaria(this.valorDiaria)
                .build();
    }


}
