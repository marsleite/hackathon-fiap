package com.grupo29.hackathon.resource.gateway;


import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.resource.repository.entity.QuartoEntity;
import com.grupo29.hackathon.resource.repository.spring.QuartoRepositorySpring;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class QuartoRepositoryImpl implements QuartoRepositoryGateway {

    private final QuartoRepositorySpring repo;

    public QuartoRepositoryImpl(QuartoRepositorySpring repo){
        this.repo = repo;
    }


    @Override
    public Quarto create(Quarto quarto) {
        return repo.save(
               QuartoEntity.builder()
                       .localidade(quarto.getLocalidade())
                       .predio(quarto.getPredio())
                       .tipoQuarto(quarto.getTipoQuarto())
                       .valorDiaria(quarto.getValorDiaria())
                       .build()).toDomain();
    }

    @Override
    public boolean existsById(Long id) {
        return repo.existsById(id);
    }

    @Override
    public Quarto findById(Long id) {
         Optional<QuartoEntity> result = repo.findById(id);
        return result.map(QuartoEntity::toDomain).orElse(null);

    }
}
