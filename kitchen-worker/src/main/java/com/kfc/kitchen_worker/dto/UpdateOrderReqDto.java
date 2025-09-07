package com.kfc.kitchen_worker.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UpdateOrderReqDto {

    private Date updatedAt;
    private String orderStatus;
}
