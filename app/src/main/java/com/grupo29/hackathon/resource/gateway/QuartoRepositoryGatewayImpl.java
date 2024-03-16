package com.grupo29.hackathon.resource.gateway;


import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.resource.entity.quartos.PredioEntity;
import com.grupo29.hackathon.resource.entity.quartos.QuartoEntity;
import com.grupo29.hackathon.resource.sql.LocalidadeRepositorySpring;
import com.grupo29.hackathon.resource.sql.PredioRepositorySpring;
import com.grupo29.hackathon.resource.sql.QuartoRepositorySpring;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class QuartoRepositoryGatewayImpl implements QuartoRepositoryGateway {

    private final QuartoRepositorySpring quartoRepositorySpring;

    private final PredioRepositorySpring predioRepositorySpring;


    public QuartoRepositoryGatewayImpl(QuartoRepositorySpring quartoRepositorySpring, PredioRepositorySpring predioRepositorySpring, LocalidadeRepositorySpring localidadeRepositorySpring) {
        this.quartoRepositorySpring = quartoRepositorySpring;
        this.predioRepositorySpring = predioRepositorySpring;
    }


    @Override
    public Quarto create(Long predioId, Quarto quarto) {
        PredioEntity predioEntity = predioRepositorySpring.findById(predioId).orElseThrow();
        return quartoRepositorySpring.save(new QuartoEntity(quarto, predioEntity)).toDomain();
    }

    @Override
    public boolean existsById(Long id) {
        return quartoRepositorySpring.existsById(id);
    }

    @Override
    public Quarto findById(Long id) {
        Optional<QuartoEntity> result = quartoRepositorySpring.findById(id);
        return result.map(QuartoEntity::toDomain).orElse(null);

    }

    @Override
    public void deleteById(Long id) {
        quartoRepositorySpring.deleteById(id);
    }

    @Override
    public Quarto update(Long predioId, Quarto quarto) {
        PredioEntity predioEntity = predioRepositorySpring.findById(predioId).orElseThrow();
        return quartoRepositorySpring.save(new QuartoEntity(quarto, predioEntity)).toDomain();
    }
}
