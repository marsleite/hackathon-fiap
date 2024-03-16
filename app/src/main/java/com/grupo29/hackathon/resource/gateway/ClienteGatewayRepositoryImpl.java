package com.grupo29.hackathon.resource.gateway;

import com.grupo29.hackathon.gateway.ClienteRepositoryGateway;
import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.resource.entity.clientes.ClienteEntity;
import com.grupo29.hackathon.resource.sql.ClienteRepositorySpring;
import com.grupo29.hackathon.resource.sql.DocumentoRepositorySpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteGatewayRepositoryImpl implements ClienteRepositoryGateway {

  @Autowired
  private ClienteRepositorySpring clienteRepositorySpring;

  @Autowired
  private DocumentoRepositorySpring documentoRepositorySpring;

  @Override
  public Cliente create(Cliente cliente) {
    return clienteRepositorySpring.save(new ClienteEntity(cliente));
  }

  @Override
  public Cliente findById(String id) {
    return clienteRepositorySpring.findById(Long.valueOf(id)).get();
  }

  @Override
  public Cliente update(Cliente cliente) {
    return clienteRepositorySpring.save(cliente);
  }

  @Override
  public void delete(String id) {
    clienteRepositorySpring.deleteById(Long.valueOf(id));
  }
}
