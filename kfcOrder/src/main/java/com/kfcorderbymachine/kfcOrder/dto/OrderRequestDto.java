package com.kfcorderbymachine.kfcOrder.dto;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class OrderRequestDto {

    private Map<String, Integer> products;
    private String mobile;
    private Date createdAt;
}
