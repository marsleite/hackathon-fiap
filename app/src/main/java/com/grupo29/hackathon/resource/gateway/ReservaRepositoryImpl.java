package com.grupo29.hackathon.resource.gateway;


import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.resource.repository.entity.ReservaEntity;
import com.grupo29.hackathon.resource.repository.spring.ReservaRepositorySpring;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservaRepositoryImpl implements ReservaRepositoryGateway {

    private final ReservaRepositorySpring repo;

    public ReservaRepositoryImpl(ReservaRepositorySpring repo){
        this.repo = repo;
    }

    @Override
    public Reserva create(Reserva reserva) {
        return null;
    }

    @Override
    public List<Reserva> verificaReservaPorQuartoeData(Reserva reserva) {
        return null;
    }


    /*@Override
    public Reserva create(Reserva reserva) {
        return repo.save(
               ReservaEntity.builder()
                       .cliente(reserva.getCliente())
                       .opcionais(reserva.getOpcionais())
                       .quartos(reserva.getQuartos())
                       .quantidadeHospedes(reserva.getQuantidadeHospedes())
                       .dataReserva(reserva.getDataReserva())
                       .dataEntrada(reserva.getDataEntrada())
                       .dataSaida(reserva.getDataSaida())
                       .build()).toDomain();
    }*/
}
