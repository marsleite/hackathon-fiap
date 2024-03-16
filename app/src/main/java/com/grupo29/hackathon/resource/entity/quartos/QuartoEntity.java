package com.grupo29.hackathon.resource.entity.quartos;

import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.quartos.TipoQuarto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class QuartoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private LocalidadeEntity localidade;

    @ManyToOne
    private PredioEntity predio;
    private TipoQuarto tipoQuarto;
    private BigDecimal valorDiaria;

    // fazer um construtor
    public QuartoEntity(Quarto quarto, PredioEntity predioEntity) {
        this.localidade = predioEntity.getLocalidade();
        this.predio = predioEntity;
        this.tipoQuarto = quarto.getTipoQuarto();
        this.valorDiaria = quarto.getValorDiaria();
    }

    public Quarto toDomain() {
        return Quarto.builder().build();
    }
}
