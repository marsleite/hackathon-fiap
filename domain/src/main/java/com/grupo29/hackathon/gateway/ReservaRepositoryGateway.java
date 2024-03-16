package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.reservas.Reserva;

import java.util.List;

public interface ReservaRepositoryGateway {
  void create(Reserva reserva);
  List<Reserva> obterReservasDeQuarto(Long idQuarto);

  void delete(String id);

  void update(Reserva reserva);

}
