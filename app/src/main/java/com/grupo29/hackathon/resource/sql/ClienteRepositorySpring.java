package com.grupo29.hackathon.resource.sql;

import com.grupo29.hackathon.model.clientes.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorySpring extends JpaRepository<Cliente, Long> {

}
