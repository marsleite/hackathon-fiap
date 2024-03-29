package com.grupo29.hackathon.useCase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.grupo29.hackathon.gateway.QuartoRepositoryGateway;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.useCase.quartos.FindQuartoUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class FindQuartoUseCaseTest {
  @Mock
  private QuartoRepositoryGateway quartoRepositoryGateway;

  @InjectMocks
  private FindQuartoUseCase findQuartoUseCase;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  public void shouldNotFindQuartoWhenInvalidIdIsProvided() {
    String id = "invalidId";
    when(quartoRepositoryGateway.findById(Long.parseLong(id))).thenReturn(null);

    Quarto result = findQuartoUseCase.execute(id);

    assertEquals(null, result);
    verify(quartoRepositoryGateway, times(1)).findById(Long.parseLong(id));
  }
}
