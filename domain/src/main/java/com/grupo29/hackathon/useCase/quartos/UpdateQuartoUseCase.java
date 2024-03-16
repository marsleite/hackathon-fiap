package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import org.springframework.stereotype.Component;

@Component
public class UpdateQuartoUseCase {
    private QuartoRepositoryGateway quartoRepositoryGateway;

    public Quarto execute(Long predioId, Quarto quarto) {
        return quartoRepositoryGateway.update(predioId, quarto);
    }
}
