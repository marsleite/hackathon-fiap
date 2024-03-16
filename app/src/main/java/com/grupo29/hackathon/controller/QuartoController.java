package com.grupo29.hackathon.controller;

import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.useCase.quartos.CreateQuartoUseCase;
import com.grupo29.hackathon.useCase.quartos.DeleteQuartoUseCase;
import com.grupo29.hackathon.useCase.quartos.FindQuartoUseCase;
import com.grupo29.hackathon.useCase.quartos.UpdateQuartoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuartoController {

  private final CreateQuartoUseCase createQuartoUseCase;
  private final DeleteQuartoUseCase deleteQuartoUseCase;

  private final FindQuartoUseCase findQuartoUseCase;

  private final UpdateQuartoUseCase updateQuartoUseCase;

  @Autowired
  public QuartoController(CreateQuartoUseCase createQuartoUseCase,
                          DeleteQuartoUseCase deleteQuartoUseCase,
                          FindQuartoUseCase findQuartoUseCase,
                          UpdateQuartoUseCase updateQuartoUseCase
  ) {
    this.createQuartoUseCase = createQuartoUseCase;
    this.deleteQuartoUseCase = deleteQuartoUseCase;
    this.findQuartoUseCase = findQuartoUseCase;
    this.updateQuartoUseCase = updateQuartoUseCase;
  }

    @PostMapping("/quartos/{predioId}")
    public Quarto createQuarto(@RequestBody Quarto quarto, @PathVariable String predioId) {
      return createQuartoUseCase.create(Long.valueOf(predioId), quarto);
    }

    @DeleteMapping("/quartos/delete/{id}")
    public void deleteQuarto(@PathVariable String id) {
        deleteQuartoUseCase.execute(id);

    }

    @GetMapping("/quartos/find/{id}")
    public Quarto findQuarto(@PathVariable String id) {
        return findQuartoUseCase.execute(id);
    }

    @PostMapping("/quartos/update/{predioId}")
    public Quarto updateQuarto(@RequestBody Quarto quarto, @PathVariable String predioId) {
        return updateQuartoUseCase.execute(Long.valueOf(predioId), quarto);
    }



}
