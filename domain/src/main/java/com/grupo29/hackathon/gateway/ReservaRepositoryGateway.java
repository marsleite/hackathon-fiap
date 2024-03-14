package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.reservas.Reserva;

public interface ReservaRepositoryGateway {
  void create(Reserva reserva);

  boolean isQuartoReservado(Reserva reserva);



}
