package com.grupo29.hackathon.resource.repository.spring;

import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.resource.repository.entity.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepositorySpring extends JpaRepository<ReservaEntity, Long> {

    List<ReservaEntity> findAllByQuarto(Quarto quarto);

}
