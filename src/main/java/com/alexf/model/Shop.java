package com.alexf.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shop")
public class Shop {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID_magazin")
  private int IDMagazin;

  @Column(name = "nume_magazin")
  private String numeMagazin;

  @Column(name = "adresa_magazin")
  private String adresaMagazin;

  @Column(name = "adresa_email_magazin")
  private String adresaEmailMagazin;

  @Column(name = "numar_telefon_magazin")
  private String numarTelefonMagazin;

  @Column(name = "cont_bancar_magazin")
  private String contBancarMagazin;

  @Column(name = "orar_magazin")
  private HashMap<String, String> orarMagazin;

}
