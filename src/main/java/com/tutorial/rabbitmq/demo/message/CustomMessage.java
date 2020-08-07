package com.tutorial.rabbitmq.demo.message;

import java.io.Serializable;
import java.util.List;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CustomMessage implements Serializable {

  private String ptName;
  private String pickNo;
  private String callNo;
  private String callType;
  private String orderType;
  private String billNo;
  private String posNo;
  private String deliveryAddr;
  private String saleDate;
  private List tenants;

  protected CustomMessage() {
  }


  @Builder
  public CustomMessage(String ptName, String pickNo, String callNo, String callType, String orderType, String billNo, String posNo, String deliveryAddr, String saleDate, List tenants) {
    this.ptName = ptName;
    this.pickNo = pickNo;
    this.callNo = callNo;
    this.callType = callType;
    this.orderType = orderType;
    this.billNo = billNo;
    this.posNo = posNo;
    this.deliveryAddr = deliveryAddr;
    this.saleDate = saleDate;
    this.tenants = tenants;
  }

  @Override
  public String toString() {
    return "CustomMessage{" +
        "ptName = " + ptName +
        "pickNo = " + pickNo +
        "callNo = " + callNo
        ;
  }
}
