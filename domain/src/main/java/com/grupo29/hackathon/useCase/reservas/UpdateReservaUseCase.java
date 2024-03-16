package com.grupo29.hackathon.useCase.reservas;

import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.reservas.Reserva;
import org.springframework.stereotype.Component;

@Component
public class UpdateReservaUseCase {
    private final ReservaRepositoryGateway reservaRepository;

    public UpdateReservaUseCase(ReservaRepositoryGateway reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void execute(Reserva reserva) {
        reservaRepository.update(reserva);
    }

}
