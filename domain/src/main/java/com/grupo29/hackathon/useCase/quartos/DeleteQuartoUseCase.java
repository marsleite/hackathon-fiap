package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoGatewayRepository;
import com.grupo29.hackathon.model.quartos.Quarto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
public class DeleteQuartoUseCase {
    private QuartoGatewayRepository quartoGatewayRepository;

    public void execute(Quarto quarto) {
        quartoGatewayRepository.delete(String.valueOf(quarto.getId()));
    }
}
