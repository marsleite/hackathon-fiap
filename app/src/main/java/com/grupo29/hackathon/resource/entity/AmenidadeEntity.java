package com.grupo29.hackathon.resource.entity;

import com.grupo29.hackathon.model.quartos.Amenidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
public class AmenidadeEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Amenidade amenidade;

  public AmenidadeEntity() {
  }

  public AmenidadeEntity(Amenidade amenidade) {
    this.amenidade = amenidade;
  }
}
