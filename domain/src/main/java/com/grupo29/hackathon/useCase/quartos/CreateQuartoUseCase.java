package com.grupo29.hackathon.useCase.quartos;

import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.utils.FieldUtils;

public class CreateQuartoUseCase {

    private final QuartoRepositoryGateway quartoRepository;


    public CreateQuartoUseCase(QuartoRepositoryGateway quartoRepository) {
        this.quartoRepository = quartoRepository;
    }

    public Quarto create(Quarto quarto) {
        Boolean validateFields = FieldUtils.areFieldsNotNull(
                quarto.getTipoQuarto()
        );

        if (!validateFields) {
            throw new RuntimeException("erro");
        }

        return quartoRepository.create(quarto);
    }


}
