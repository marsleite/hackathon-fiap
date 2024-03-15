package com.grupo29.hackathon.model.reservas;

import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.model.opcionais.Opcionais;
import com.grupo29.hackathon.model.quartos.Quarto;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class Reserva {
    private Cliente cliente;
    private Opcionais opcionais;
    private List<Quarto> quartos;
    private Integer quantidadeHospedes;
    private LocalDate dataReserva;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
}
