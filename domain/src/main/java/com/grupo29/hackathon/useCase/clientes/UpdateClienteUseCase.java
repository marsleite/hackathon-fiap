package com.grupo29.hackathon.useCase.clientes;

import com.grupo29.hackathon.gateway.ClienteGatewayRepository;
import com.grupo29.hackathon.model.clientes.Cliente;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateClienteUseCase {
    private ClienteGatewayRepository clienteGatewayRepository;

    public Cliente execute(Cliente cliente) {
        return clienteGatewayRepository.update(cliente);
    }
}
