package com.grupo29.hackathon.useCase.reservas;

import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.utils.FieldUtils;

public class CreateReservaUseCase {

    private final ReservaRepositoryGateway reservaRepository;


    public CreateReservaUseCase(ReservaRepositoryGateway reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public void create(Reserva reserva) {

        if (reservaRepository.isQuartoReservado(reserva)){
            throw new RuntimeException("quarto já reservado");
        }

        Boolean validateFields = FieldUtils.areFieldsNotNull(
                reserva.getDataReserva()
        );

        if (!validateFields) {
            throw new RuntimeException("erro");
        }

        reservaRepository.create(reserva);
    }


}
