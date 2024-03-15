package com.grupo29.hackathon.resource.gateway;

import com.grupo29.hackathon.gateway.ClienteGatewayRepository;
import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.resource.sql.ClienteRepositorySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteGatewayRepositoryImpl implements ClienteGatewayRepository {

  @Autowired
  private ClienteRepositorySpring clienteRepositorySpring;

  @Override
  public Cliente create(Cliente quarto) {
    return clienteRepositorySpring.save(quarto);
  }

  @Override
  public Cliente findById(String id) {
    return clienteRepositorySpring.findById(Long.valueOf(id)).get();
  }

  @Override
  public Cliente update(Cliente quarto) {
    return clienteRepositorySpring.save(quarto);
  }

  @Override
  public void delete(String id) {
    clienteRepositorySpring.deleteById(Long.valueOf(id));
  }
}
