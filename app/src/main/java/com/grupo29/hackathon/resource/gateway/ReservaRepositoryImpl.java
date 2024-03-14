package com.grupo29.hackathon.resource.gateway;


import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.resource.repository.entity.ReservaEntity;
import com.grupo29.hackathon.resource.repository.spring.ReservaRepositorySpring;
import org.springframework.stereotype.Repository;

@Repository
public class ReservaRepositoryImpl implements ReservaRepositoryGateway {

    private final ReservaRepositorySpring repo;

    public ReservaRepositoryImpl(ReservaRepositorySpring repo){
        this.repo = repo;
    }


    @Override
    public boolean isQuartoReservado(Reserva reserva) {
        for (Quarto quarto: reserva.getQuartos()){
            if (repo.existsByQuarto(quarto)) //TODO ajustar para verificar a data de entrada e saida
                return true;
        }
        return false;
    }


    @Override
    public void create(Reserva reserva) {
        repo.save(ReservaEntity.builder()
                .cliente(reserva.getCliente())
                .opcionais(reserva.getOpcionais())
                .quartos(reserva.getQuartos())
                .quantidadeHospedes(reserva.getQuantidadeHospedes())
                .dataReserva(reserva.getDataReserva())
                .dataEntrada(reserva.getDataEntrada())
                .dataSaida(reserva.getDataSaida())
                .build());

    }
}
