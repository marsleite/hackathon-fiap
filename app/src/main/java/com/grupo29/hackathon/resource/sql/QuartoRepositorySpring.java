package com.grupo29.hackathon.resource.sql;

import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.resource.entity.quartos.QuartoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuartoRepositorySpring extends JpaRepository<QuartoEntity, Long> {
  List<Quarto> findByLocalidade(String localidadeId);
}
