package com.alexf.utils;


import lombok.Getter;


@Getter
public enum OrderStatus {
  NEW(0, "New Order"),
  UPDATED(1, "Updated"),
  FINISHED(2, "Finished"),
  CANCELED(3, "Canceled");

  private int code;

  private String status;

  OrderStatus (int code, String status) {

    this.code = code;
    this.status = status;
  }
}
