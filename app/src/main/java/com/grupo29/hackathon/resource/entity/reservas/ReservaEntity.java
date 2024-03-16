package com.grupo29.hackathon.resource.entity.reservas;

import com.grupo29.hackathon.model.clientes.Cliente;
import com.grupo29.hackathon.model.opcionais.Opcionais;
import com.grupo29.hackathon.model.quartos.Quarto;
import com.grupo29.hackathon.model.reservas.Reserva;
import com.grupo29.hackathon.resource.entity.clientes.ClienteEntity;
import com.grupo29.hackathon.resource.entity.opcionais.OpcionaisEntity;
import com.grupo29.hackathon.resource.entity.quartos.QuartoEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private ClienteEntity clienteEntity;
    @OneToOne
    private OpcionaisEntity opcionaisEntity;
    @OneToMany
    private List<QuartoEntity> quartosEntity;
    private Integer quantidadeHospedes;
    private LocalDate dataReserva;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;


    public Reserva toDomain() {
        return Reserva.builder()
                .cliente(this.clienteEntity.toDomain())
                .opcionais(this.opcionaisEntity.toDomain())
                .quartos(quartosEntity.stream().map(QuartoEntity::toDomain).collect(Collectors.toList()))
                .quantidadeHospedes(this.quantidadeHospedes)
                .dataReserva(this.dataReserva)
                .dataEntrada(this.dataEntrada)
                .dataSaida(this.dataSaida)
                .build();
    }


}
