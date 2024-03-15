package com.grupo29.hackathon.resource.entity;

import com.grupo29.hackathon.model.quartos.Localidade;
import com.grupo29.hackathon.model.quartos.Predio;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.quartos.TipoQuarto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
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
  public QuartoEntity(Quarto quarto, LocalidadeEntity localidadeEntity, PredioEntity predioEntity) {
    this.localidade = localidadeEntity;
    this.predio = predioEntity;
    this.tipoQuarto = quarto.getTipoQuarto();
    this.valorDiaria = quarto.getValorDiaria();
  }
}
