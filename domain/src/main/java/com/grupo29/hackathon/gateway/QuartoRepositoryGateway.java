package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.quartos.Quarto;

public interface QuartoRepositoryGateway {
    Quarto create(Long predioId, Quarto quarto);

    boolean existsById(Long id);

    Quarto findById(Long id);

    void deleteById(Long id);

    Quarto update(Long predioId, Quarto quarto);
}
