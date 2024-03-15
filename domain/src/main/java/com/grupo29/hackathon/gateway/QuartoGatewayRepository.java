package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.quartos.Quarto;
import java.util.List;

public interface QuartoGatewayRepository {

    public Quarto create(Quarto quarto);

    public Quarto findById(String id);

    public Quarto update(Quarto quarto);

    public List<Quarto> findByLocalidade(String localidade);

    public void delete(String id);
}
