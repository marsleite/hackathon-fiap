package com.grupo29.hackathon.resource.entity;

import com.grupo29.hackathon.model.quartos.Endereco;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class EnderecoEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String rua;
  private String cidade;
  private String estado;
  private String cep;

  @OneToOne
  private LocalidadeEntity localidade;

  public EnderecoEntity(Endereco endereco) {
    this.id = endereco.getId();
    this.rua = endereco.getRua();
    this.cidade = endereco.getCidade();
    this.estado = endereco.getEstado();
    this.cep = endereco.getCep();
  }
}
