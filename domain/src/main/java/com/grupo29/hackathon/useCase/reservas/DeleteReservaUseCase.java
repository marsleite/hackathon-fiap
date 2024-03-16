package com.grupo29.hackathon.useCase.reservas;

import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import org.springframework.stereotype.Component;

@Component
public class DeleteReservaUseCase {

    private final ReservaRepositoryGateway reservaRepository;

    public DeleteReservaUseCase(ReservaRepositoryGateway reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void execute(String id) {
        reservaRepository.delete(id);
    }
}
