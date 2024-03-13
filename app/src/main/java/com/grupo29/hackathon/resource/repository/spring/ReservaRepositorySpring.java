package com.grupo29.hackathon.resource.repository.spring;

import com.grupo29.hackathon.resource.repository.entity.QuartoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepositorySpring extends JpaRepository<QuartoEntity, Long> {



}
