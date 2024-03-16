package com.grupo29.hackathon.resource.entity;

import com.grupo29.hackathon.model.quartos.Amenidade;
import com.grupo29.hackathon.model.quartos.Endereco;
import com.grupo29.hackathon.model.quartos.Localidade;
import com.grupo29.hackathon.model.quartos.Predio;
import com.grupo29.hackathon.model.quartos.Quarto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class LocalidadeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nome;

  @OneToOne
  private EnderecoEntity endereco;
  @OneToMany
  private List<AmenidadeEntity> amenidades;

  @OneToMany
  private List<PredioEntity> predios;

  @OneToMany
  @JoinColumn(name = "localidade_id")
  private List<QuartoEntity> quartos;

    public LocalidadeEntity(
        Localidade localidade,
        List<PredioEntity> prediosEntity,
        List<QuartoEntity> quartosEntity
    ) {
      this.id = localidade.getId();
      this.nome = localidade.getNome();
      this.endereco = new EnderecoEntity(localidade.getEndereco());
      this.amenidades = localidade.getAmenidades().stream()
          .map(AmenidadeEntity::new)
          .collect(Collectors.toList());
      this.predios = prediosEntity;
      this.quartos = quartosEntity;
    }

}
