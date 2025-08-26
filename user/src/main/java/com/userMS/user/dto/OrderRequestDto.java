package com.userMS.user.dto;

import lombok.Data;

@Data
public class OrderRequestDto {

    private String orderId;
    private Object data;
    private Object error;
    private Boolean flag;
    private String status;
    private String userId;
}
