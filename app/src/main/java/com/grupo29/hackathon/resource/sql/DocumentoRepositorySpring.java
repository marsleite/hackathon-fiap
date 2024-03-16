package com.grupo29.hackathon.resource.sql;

import com.grupo29.hackathon.resource.entity.clientes.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface DocumentoRepositorySpring extends JpaRepository<DocumentoEntity, Long> {
}
