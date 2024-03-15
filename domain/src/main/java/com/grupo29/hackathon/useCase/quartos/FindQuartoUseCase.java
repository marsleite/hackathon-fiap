package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoGatewayRepository;
import com.grupo29.hackathon.model.quartos.Quarto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FindQuartoUseCase {
    private QuartoGatewayRepository quartoGatewayRepository;

    public Quarto execute(Quarto quarto) {
        return quartoGatewayRepository.findById(String.valueOf(quarto.getId()));
    }
}
