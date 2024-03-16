package com.grupo29.hackathon.useCase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.grupo29.hackathon.gateway.ClienteRepositoryGateway;
import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.useCase.clientes.UpdateClienteUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DeleteQuartoUseCaseTest {
  @Mock
  private ClienteRepositoryGateway clienteRepositoryGateway;

  @InjectMocks
  private UpdateClienteUseCase updateClienteUseCase;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void shouldUpdateClienteWhenValidClienteIsProvided() {
    Cliente cliente = new Cliente();
    when(clienteRepositoryGateway.update(any(Cliente.class))).thenReturn(cliente);

    Cliente result = updateClienteUseCase.execute(cliente);

    assertEquals(cliente, result);
    verify(clienteRepositoryGateway, times(1)).update(cliente);
  }

  @Test
  public void shouldNotUpdateClienteWhenNullIsProvided() {
    when(clienteRepositoryGateway.update(null)).thenThrow(new IllegalArgumentException());

    try {
      updateClienteUseCase.execute(null);
    } catch (IllegalArgumentException e) {
      verify(clienteRepositoryGateway, times(1)).update(null);
    }
  }
}
