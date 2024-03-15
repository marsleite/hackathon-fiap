package com.grupo29.hackathon.resource.gateway;

import com.grupo29.hackathon.gateway.QuartoGatewayRepository;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.resource.sql.QuartoRepositorySpring;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuartoGatewayRepositoryImpl implements QuartoGatewayRepository {

  @Autowired
  private QuartoRepositorySpring quartoRepositorySpring;

  @Override
  public Quarto create(Quarto quarto) {
    return quartoRepositorySpring.save(quarto);
  }

  @Override
  public Quarto findById(String id) {
    return quartoRepositorySpring.findById(Long.valueOf(id)).get();
  }

  public List<Quarto> findByLocalidade(String localidade) {
    return quartoRepositorySpring.findByLocalidade(localidade);
  }

  @Override
  public Quarto update(Quarto quarto) {
    return quartoRepositorySpring.save(quarto);
  }

  @Override
  public void delete(String id) {
    quartoRepositorySpring.deleteById(Long.valueOf(id));
  }
}
