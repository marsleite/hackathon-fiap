package com.grupo29.hackathon.controller;

import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.useCase.clientes.CreateClienteUseCase;
import com.grupo29.hackathon.useCase.clientes.DeleteClienteUseCase;
import com.grupo29.hackathon.useCase.clientes.FindClienteUseCase;
import com.grupo29.hackathon.useCase.clientes.UpdateClienteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private final CreateClienteUseCase createClienteUseCase;
    private final DeleteClienteUseCase deleteClienteUseCase;

    private final FindClienteUseCase findClienteUseCase;

    private final UpdateClienteUseCase updateClienteUseCase;

    @Autowired
    public ClienteController(CreateClienteUseCase createClienteUseCase,
                            DeleteClienteUseCase deleteClienteUseCase,
                            FindClienteUseCase findClienteUseCase,
                            UpdateClienteUseCase updateClienteUseCase
    ) {
        this.createClienteUseCase = createClienteUseCase;
        this.deleteClienteUseCase = deleteClienteUseCase;
        this.findClienteUseCase = findClienteUseCase;
        this.updateClienteUseCase = updateClienteUseCase;
    }

        @PostMapping("/clientes")
        public void createCliente(@RequestBody Cliente cliente) {
            createClienteUseCase.execute(cliente);
        }

        @DeleteMapping("/clientes/delete/{id}")
        public void deleteCliente(@PathVariable String id) {
            deleteClienteUseCase.execute(id);

        }

        @GetMapping("/clientes/find/{id}")
        public void findCliente(@PathVariable String id) {
            findClienteUseCase.execute(id);
        }

        @PostMapping("/clientes/update")
        public void updateCliente(@RequestBody Cliente cliente) {
            updateClienteUseCase.execute(cliente);
        }
}
