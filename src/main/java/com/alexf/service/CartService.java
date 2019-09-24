package com.alexf.service;


import com.alexf.model.Cart;
import com.alexf.model.Client;


public interface CartService {

  Cart getCart (Client client);


  void deleteItemFromCart (String productName, Client client);


  void checkoutCart (Client client);


}
