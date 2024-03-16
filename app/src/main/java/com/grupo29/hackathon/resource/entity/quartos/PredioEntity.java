package com.grupo29.hackathon.resource.entity.quartos;

import com.grupo29.hackathon.model.quartos.Predio;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class PredioEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "localidade_id")
  private LocalidadeEntity localidade;

  @OneToMany
  private List<QuartoEntity> quartos;

  public PredioEntity(LocalidadeEntity localidade, QuartoEntity quarto) {
    this.localidade = localidade;
    this.quartos = Collections.singletonList(quarto);
  }

  public PredioEntity(Predio predio) {
  }
}
