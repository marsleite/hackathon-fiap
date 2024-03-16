package com.grupo29.hackathon.resource.gateway;


import com.grupo29.hackathon.gateway.ReservaRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.resource.repository.entity.ReservaEntity;
import com.grupo29.hackathon.resource.repository.spring.QuartoRepositorySpring;
import com.grupo29.hackathon.resource.repository.spring.ReservaRepositorySpring;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservaRepositoryImpl implements ReservaRepositoryGateway {

    private final ReservaRepositorySpring repo;
    private final QuartoRepositorySpring repoQuarto;

    public ReservaRepositoryImpl(ReservaRepositorySpring repo, QuartoRepositorySpring repoQuarto){
        this.repo = repo;
        this.repoQuarto = repoQuarto;
    }



    @Override
    public List<Reserva> obterReservasDeQuarto(Long idQuarto) {
        Quarto quarto = repoQuarto.findById(idQuarto).get().toDomain();

        List<ReservaEntity> result = repo.findAllByQuarto(quarto);

        List<Reserva> reserva = null;

        for(ReservaEntity r: result){
            reserva.add(r.toDomain());
        }

        return reserva;
    }

    @Override
    public void delete(String id) {
        repo.deleteById(Long.valueOf(id));
    }

    @Override
    public void update(Reserva reserva) {
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
