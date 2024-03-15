package com.grupo29.hackathon.resource.sql;

import com.grupo29.hackathon.model.quartos.Quarto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuartoRepositorySpring extends JpaRepository<Quarto, Long> {

  List<Quarto> findByLocalidade(String localidadeId);
}
