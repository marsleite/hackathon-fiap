package com.grupo29.hackathon.gateway;

import com.grupo29.hackathon.model.reservas.Reserva;

import java.util.List;

public interface ReservaRepositoryGateway {
  Reserva create(Reserva reserva);

  List<Reserva> verificaReservaPorQuartoeData(Reserva reserva);



}
