package com.alexf.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID_CART")
  private int IDCart;

  @Column(name = "cart")
  private Set<Product> products = new HashSet<>();
}
