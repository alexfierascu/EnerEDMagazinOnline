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
@Table(name = "Produs")

public class Produs {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID_produs")
  private int IDProdus;

  @Column(name = "pret_produs")
  private double pretProdus;

  @Column(name = "discount_produs")
  private boolean discountProdus;

  @Column(name = "valoare_discount_produs")
  private double valoareDiscountProdus;

  @Column(name = "nume_produs")
  private String numeProdus;

  @Column(name = "marca_produs")
  private String marcaProdus;

  @Column(name = "tip_produs")
  private String tipProdus;

  @Column(name = "categorie_produs")
  private String categorieProdus;

  @Column(name = "garantie_produs")
  private int garantieProdus;

}
