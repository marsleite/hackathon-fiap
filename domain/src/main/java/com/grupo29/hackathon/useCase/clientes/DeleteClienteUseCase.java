package com.grupo29.hackathon.useCase.clientes;

import com.grupo29.hackathon.gateway.ClienteGatewayRepository;
import com.grupo29.hackathon.model.clientes.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class DeleteClienteUseCase {
    private ClienteGatewayRepository clienteGatewayRepository;

    public void execute(String id) {
        clienteGatewayRepository.delete(id);
    }
}
