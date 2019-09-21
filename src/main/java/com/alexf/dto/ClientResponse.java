package com.alexf.dto;


import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientResponse {

  private int IDClient;

  private String numeClient;

  private String prenumeClient;

  private String numarTelefonClient;


}
