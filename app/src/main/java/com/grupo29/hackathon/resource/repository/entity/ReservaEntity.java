package com.grupo29.hackathon.resource.repository.entity;

import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.model.opcionais.Opcionais;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Table(name = "reserva")
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Cliente cliente;
    private Opcionais opcionais;
    private List<Quarto> quartos;
    private Integer quantidadeHospedes;
    private LocalDate dataReserva;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;



    public Reserva toDomain() {
        return Reserva.builder()
                .cliente(this.cliente)
                .opcionais(this.opcionais)
                .quartos(this.quartos)
                .quantidadeHospedes(this.quantidadeHospedes)
                .dataReserva(this.dataReserva)
                .dataEntrada(this.dataEntrada)
                .dataSaida(this.dataSaida)
                .build();
    }


}
