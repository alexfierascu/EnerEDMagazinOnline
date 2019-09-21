package com.alexf.controller;


import com.alexf.dto.ClientResource;
import com.alexf.dto.ClientResponse;
import com.alexf.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ClientController {

  private final ClientService clientService;


  @GetMapping("/client")
  public ClientResponse getAllClients () {

    return clientService.getAllClients();
  }


  @GetMapping("/client/{ID}")
  public ClientResource getClient (
      @PathVariable String ID,
      @Valid @RequestBody ClientResource clientResource
  ) {

    return clientService.getSingleClient
        (ID, clientResource.getClient());
  }
}
