package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoGatewayRepository;
import com.grupo29.hackathon.model.quartos.Quarto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindQuartoUseCase {
    private QuartoGatewayRepository quartoGatewayRepository;

    @Autowired
    public FindQuartoUseCase(QuartoGatewayRepository quartoGatewayRepository) {
        this.quartoGatewayRepository = quartoGatewayRepository;
    }

    public Quarto execute(String id) {
        return quartoGatewayRepository.findById(id);
    }
}
