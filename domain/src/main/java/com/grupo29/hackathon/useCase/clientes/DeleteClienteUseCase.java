package com.grupo29.hackathon.useCase.clientes;

import com.grupo29.hackathon.gateway.ClienteRepositoryGateway;
import com.grupo29.hackathon.model.clientes.Cliente;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteClienteUseCase {
    private ClienteRepositoryGateway clienteRepositoryGateway;

    public void execute(Cliente cliente) {
        clienteRepositoryGateway.delete(String.valueOf(cliente.getId()));
    }
}
