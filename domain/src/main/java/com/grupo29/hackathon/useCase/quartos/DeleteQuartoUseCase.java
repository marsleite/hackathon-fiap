package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoGatewayRepository;
import com.grupo29.hackathon.model.quartos.Quarto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteQuartoUseCase {
    private QuartoGatewayRepository quartoGatewayRepository;

    @Autowired
    public DeleteQuartoUseCase(QuartoGatewayRepository quartoGatewayRepository) {
        this.quartoGatewayRepository = quartoGatewayRepository;
    }

    public void execute(String id) {
        quartoGatewayRepository.delete(id);
    }
}
