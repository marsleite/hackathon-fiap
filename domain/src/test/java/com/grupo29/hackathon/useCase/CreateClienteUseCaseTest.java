package com.grupo29.hackathon.useCase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.grupo29.hackathon.gateway.ClienteRepositoryGateway;
import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.useCase.clientes.CreateClienteUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CreateClienteUseCaseTest {

  @Mock
  private ClienteRepositoryGateway clienteRepositoryGateway;

  @InjectMocks
  private CreateClienteUseCase createClienteUseCase;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void shouldCreateClienteWhenValidClienteIsProvided() {
    Cliente cliente = new Cliente();
    when(clienteRepositoryGateway.create(any(Cliente.class))).thenReturn(cliente);

    Cliente result = createClienteUseCase.execute(cliente);

    assertEquals(cliente, result);
    verify(clienteRepositoryGateway, times(1)).create(cliente);
  }

  @Test
  public void shouldNotCreateClienteWhenNullIsProvided() {
    when(clienteRepositoryGateway.create(null)).thenThrow(new IllegalArgumentException());

    try {
      createClienteUseCase.execute(null);
    } catch (IllegalArgumentException e) {
      verify(clienteRepositoryGateway, times(1)).create(null);
    }
  }
}
