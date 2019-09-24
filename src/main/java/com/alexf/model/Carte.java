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
@Table(name = "carte")
public class Carte {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id_carte")
  private int id;

  @Column(name = "nume_carte")
  private String nume;

}
