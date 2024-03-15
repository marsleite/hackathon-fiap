package com.grupo29.hackathon.useCase.clientes;

import com.grupo29.hackathon.gateway.ClienteGatewayRepository;
import com.grupo29.hackathon.model.clientes.Cliente;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteClienteUseCase {
    private ClienteGatewayRepository clienteGatewayRepository;

    public void execute(Cliente cliente) {
        clienteGatewayRepository.delete(String.valueOf(cliente.getId()));
    }
}
