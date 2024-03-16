package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateQuartoUseCase {

    private final QuartoRepositoryGateway quartoRepository;

    public Quarto create(Long predioId, Quarto quarto) {
        return quartoRepository.create(predioId, quarto);
    }


}
