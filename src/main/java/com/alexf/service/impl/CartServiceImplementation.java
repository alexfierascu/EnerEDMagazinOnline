package com.alexf.service.impl;


import com.alexf.model.Cart;
import com.alexf.model.Client;
import com.alexf.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ProductRepository;

import javax.transaction.Transactional;
import java.util.Optional;


public class CartServiceImplementation implements CartService {

  @Autowired
  ProductRepository productRepository;


  @Override
  public Cart getCart (Client client) {

    return client.getCart();
  }


  //TODO - implement deleteItemFromCart and check Optional
  /*@Override
  @Transactional
  public void deleteItemFromCart (String productName, Client client) {

    Optional optional =
        client.getCart().getProducts().stream().filter(
            e -> productName.equals(e.getNumeProdus())).findFirst();
    ((Optional) optional).ifPresent(
        product -> product.setCart(null));


  }*/


  @Override
  @Transactional
  public void checkoutCart (Client client) {

  }
}
