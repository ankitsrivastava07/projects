package com.order_queue.orderHandling.dto;

import lombok.Data;

@Data
public class ApiResponse {

    private String msg;
    private Boolean flag;
    private Object data;
    private Object error;
}
