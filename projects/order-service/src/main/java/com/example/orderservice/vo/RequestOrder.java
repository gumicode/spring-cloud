package com.example.orderservice.vo;

import lombok.Data;

@Data
public class RequestOrder {

    private String productId;
    private Integer quantity;
    private Integer unitPrice;
    private Integer totalPrice;
    private String userId;
    private String orderId;
}
