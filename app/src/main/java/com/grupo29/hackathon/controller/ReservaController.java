package com.grupo29.hackathon.controller;

import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.useCase.reservas.CreateReservaUseCase;
import com.grupo29.hackathon.useCase.reservas.DeleteReservaUseCase;
import com.grupo29.hackathon.useCase.reservas.FindReservaUseCase;
import com.grupo29.hackathon.useCase.reservas.UpdateReservaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {

    private final CreateReservaUseCase createReservaUseCase;
    private final DeleteReservaUseCase deleteReservaUseCase;

    private final FindReservaUseCase findReservaUseCase;

    private final UpdateReservaUseCase updateReservaUseCase;

    @Autowired
    public ReservaController(CreateReservaUseCase createReservaUseCase,
                            DeleteReservaUseCase deleteReservaUseCase,
                            FindReservaUseCase findReservaUseCase,
                            UpdateReservaUseCase updateReservaUseCase
    ) {
        this.createReservaUseCase = createReservaUseCase;
        this.deleteReservaUseCase = deleteReservaUseCase;
        this.findReservaUseCase = findReservaUseCase;
        this.updateReservaUseCase = updateReservaUseCase;
    }

        @PostMapping("/reservas")
        public void createReserva(@RequestBody Reserva reserva) {
          createReservaUseCase.create(reserva);
        }

        @DeleteMapping("/reservas/delete/{id}")
        public void deleteReserva(@PathVariable String id) {
            deleteReservaUseCase.execute(id);

        }

        @GetMapping("/reservas/find/{id}")
        public void findReserva(@PathVariable String id) {
          findReservaUseCase.execute(id);
        }

        @PostMapping("/reservas/update")
        public void updateReserva(@RequestBody Reserva reserva) {
          updateReservaUseCase.execute(reserva);
        }
}
