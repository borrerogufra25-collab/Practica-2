package com.salesianostriana.dam.spring.data.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Critica {

  @Id
  @GeneratedValue
  private Long id;

  private String autor;
  private String texto;
  private Double puntuacion;

  @OneToMany
  private Pelicula pelicula;

}
