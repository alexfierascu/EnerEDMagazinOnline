package com.alexf.service;


import com.alexf.dto.ClientResource;
import com.alexf.dto.ClientResponse;

import java.util.List;


public interface ClientService {

  ClientResponse getAllClients ();


  ClientResource getSingleClient (
      String IDClient,
      List<ClientResource> resursaClient
  );


}
