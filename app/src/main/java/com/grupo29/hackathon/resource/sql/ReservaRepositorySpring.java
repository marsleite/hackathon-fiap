package com.grupo29.hackathon.resource.sql;

import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.resource.entity.reservas.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepositorySpring extends JpaRepository<ReservaEntity, Long> {

    List<ReservaEntity> findAllByQuarto(Quarto quarto);

}
