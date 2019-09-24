package com.alexf.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autor")
public class Autor {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_autor")
  private int id;

  @Column(name = "nume_autor")
  private String nume;

}
