package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.quartos.Quarto;

import java.util.Optional;

public interface QuartoRepositoryGateway {
  Quarto create(Quarto quarto);

  boolean existsById(Long id);

  Quarto findById(Long id);


}
