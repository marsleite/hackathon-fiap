package com.grupo29.hackathon.useCase.clientes;

import com.grupo29.hackathon.gateway.ClienteRepositoryGateway;
import com.grupo29.hackathon.model.clientes.Cliente;
import org.springframework.stereotype.Component;

@Component
public class CreateClienteUseCase {
    private ClienteRepositoryGateway clienteRepositoryGateway;

    public Cliente execute(Cliente cliente) {
        return clienteRepositoryGateway.create(cliente);
    }
}
