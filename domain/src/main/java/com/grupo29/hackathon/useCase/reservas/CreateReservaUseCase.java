package com.grupo29.hackathon.useCase.reservas;

import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.utils.FieldUtils;

import java.util.List;

public class CreateReservaUseCase {

    private final ReservaRepositoryGateway reservaRepository;


    public CreateReservaUseCase(ReservaRepositoryGateway reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public Reserva create(Reserva reserva) {

        if (isQuartoReservado(reserva)){

        }

        Boolean validateFields = FieldUtils.areFieldsNotNull(
                reserva.getDataReserva()
        );

        if (!validateFields) {
            throw new RuntimeException("erro");
        }

        return reservaRepository.create(reserva);
    }

    private boolean isQuartoReservado(Reserva reserva) {

        List<Reserva> reservas = reservaRepository.verificaReservaPorQuartoeData(reserva);
    }

}
