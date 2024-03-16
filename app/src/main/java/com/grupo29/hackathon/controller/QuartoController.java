package com.grupo29.hackathon.controller;

import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.useCase.quartos.CreateQuartoUseCase;
import com.grupo29.hackathon.useCase.quartos.DeleteQuartoUseCase;
import com.grupo29.hackathon.useCase.quartos.FindQuartoUseCase;
import com.grupo29.hackathon.useCase.quartos.UpdateQuartoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/quartos")
    public Quarto createQuarto(@RequestBody Quarto quarto) {
      return createQuartoUseCase.create(quarto);
    }

    @DeleteMapping("/quartos/delete/{id}")
    public void deleteQuarto(@PathVariable String id) {
        deleteQuartoUseCase.execute(id);

    }

    @GetMapping("/quartos/find/{id}")
    public Quarto findQuarto(@PathVariable String id) {
        return findQuartoUseCase.execute(id);
    }

    @PostMapping("/quartos/update")
    public Quarto updateQuarto(@RequestBody Quarto quarto) {
        return updateQuartoUseCase.execute(quarto);
    }



}
