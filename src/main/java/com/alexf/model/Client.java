package com.alexf.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID_client")
  private int IDClient;

  @Column(name = "nume_client")
  private String numeClient;

  @Column(name = "prenume_client")
  private String prenumeClient;

  @Column(name = "adresa_client")
  private String adresaClient;

  @Column(name = "adresa_email_client")
  private String adresaEmailClient;

  @Column(name = "utilizator_client")
  private String numeUtilizatorClient;

  @Column(name = "parola_client")
  private String parolaClient;

  @Column(name = "numar_telefon_client")
  private String numarTelefonClient;

  @Column(name = "adresa_livrare_client")
  private String adresaLivrareClient;

  @Column(name = "adresa_facturare_client")
  private String adresaFacturareClient;

  @Column(name = "data_nastere_client")
  private LocalDateTime dataNastere;

  @Column(name = "este_societate")
  private boolean esteSocietate;

  @Column(name = "nume_firma")
  private String numeFirma;

  @Column(name = "j_firma")
  private String JFirma;

  @Column(name = "cui_firma")
  private String CUIFirma;

  @Column(name = "card_cumparaturi_client")
  private String cardCumparaturiClient;

  @Column(name = "carduri_cadou_client")
  private ArrayList<String> carduriCadouClient;


  private Cart cart;

}
