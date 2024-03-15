package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.clientes.Cliente;

public interface ClienteGatewayRepository {

    public Cliente create(Cliente Cliente);

    public Cliente findById(String id);

    public Cliente update(Cliente Cliente);

    public void delete(String id);
}
