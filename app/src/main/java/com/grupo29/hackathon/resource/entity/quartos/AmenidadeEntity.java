package com.grupo29.hackathon.resource.entity.quartos;

import com.grupo29.hackathon.model.quartos.Amenidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class AmenidadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Amenidade amenidade;

    public AmenidadeEntity(Amenidade amenidade) {
        this.amenidade = amenidade;
    }
}
