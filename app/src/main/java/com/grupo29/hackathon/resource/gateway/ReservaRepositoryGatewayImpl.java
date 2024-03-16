package com.grupo29.hackathon.resource.gateway;


import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.resource.entity.reservas.ReservaEntity;
import com.grupo29.hackathon.resource.sql.QuartoRepositorySpring;
import com.grupo29.hackathon.resource.sql.ReservaRepositorySpring;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservaRepositoryGatewayImpl implements ReservaRepositoryGateway {

    private final ReservaRepositorySpring reservaRepositorySpring;
    private final QuartoRepositorySpring quartoRepositorySpring;

    public ReservaRepositoryGatewayImpl(ReservaRepositorySpring reservaRepositorySpring, QuartoRepositorySpring quartoRepositorySpring) {
        this.reservaRepositorySpring = reservaRepositorySpring;
        this.quartoRepositorySpring = quartoRepositorySpring;
    }


    @Override
    public List<Reserva> obterReservasDeQuarto(Long idQuarto) {
        Quarto quarto = quartoRepositorySpring.findById(idQuarto)
                .orElseThrow(() -> new RuntimeException("Quarto não encontrado"))
                .toDomain();

        List<ReservaEntity> result = reservaRepositorySpring.findAllByQuarto(quarto);

        List<Reserva> reserva = null;

        for (ReservaEntity r : result) {
            reserva.add(r.toDomain());
        }

        return reserva;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void update(Reserva reserva) {

    }


    @Override
    public void create(Reserva reserva) {

        reservaRepositorySpring.save(ReservaEntity.builder()
                .clienteEntity(reserva.getCliente())
                .opcionaisEntity(reserva.getOpcionais())
                .quartosEntity(reserva.getQuartos())
                .quantidadeHospedes(reserva.getQuantidadeHospedes())
                .dataReserva(reserva.getDataReserva())
                .dataEntrada(reserva.getDataEntrada())
                .dataSaida(reserva.getDataSaida())
                .build());

    }
}
