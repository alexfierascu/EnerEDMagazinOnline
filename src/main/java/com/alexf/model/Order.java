package com.alexf.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID_order")
  private int IDORDER;

  @Column(name = "products")
  private Set<Product> products = new HashSet<>();

  @Column(name = "client_email")
  private String clientEmail;

  @Column(name = "client_address")
  private String clientAddress;

  @Column(name = "client_phoneNumber")
  private String clientPhoneNumber;

  @Column(name = "order_amount")
  private double orderAmount;

  @Column(name = "order_status")
  private String orderStatus;

  @Column(name = "order_createTime")
  private LocalDateTime orderCreateTime;

  @Column(name = "order_updateTime")
  private LocalDateTime orderUpdateTime;
}
