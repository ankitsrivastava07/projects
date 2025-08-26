package com.order_queue.orderHandling.dto;

import lombok.Data;

@Data
public class OrderDto {

    private String orderId;
    private String status;
    private String mobileNumber;
    private String email;
}
