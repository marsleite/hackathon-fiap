package com.grupo29.hackathon.resource.sql;

import com.grupo29.hackathon.resource.entity.quartos.PredioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredioRepositorySpring extends JpaRepository<PredioEntity, Long> {
}
