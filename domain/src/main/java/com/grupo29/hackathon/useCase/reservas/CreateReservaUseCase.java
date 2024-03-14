package com.grupo29.hackathon.useCase.reservas;

import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.utils.FieldUtils;

import java.util.List;

public class CreateReservaUseCase {

    private final ReservaRepositoryGateway reservaRepository;
    private final QuartoRepositoryGateway quartoRepository;


    public CreateReservaUseCase(ReservaRepositoryGateway reservaRepository, QuartoRepositoryGateway quartoRepository) {
        this.reservaRepository = reservaRepository;
        this.quartoRepository = quartoRepository;
    }

    public void create(Reserva reserva) {

        for (Quarto quarto: reserva.getQuartos()){
            if (!quartoRepository.existsById(quarto.getId())){
                throw new RuntimeException("quarto inexistente");
            }
            List<Reserva> reservasAtuaisDoQuarto = reservaRepository.obterReservasDeQuarto(quarto.getId());

            for (Reserva r: reservasAtuaisDoQuarto){
                if (r.getDataEntrada().isBefore(reserva.getDataSaida()) && reserva.getDataEntrada().isBefore(r.getDataSaida())){
                    throw new RuntimeException("um dos quartos solicitados já está reservado para as datas informadas.");
                }
            }
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
