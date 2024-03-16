package com.grupo29.hackathon.useCase.reservas;

import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import org.springframework.stereotype.Component;

@Component
public class FindReservaUseCase {
    private final ReservaRepositoryGateway reservaRepository;

    public FindReservaUseCase(ReservaRepositoryGateway reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void execute(String id) {
        reservaRepository.obterReservasDeQuarto(Long.valueOf(id));
    }
}
