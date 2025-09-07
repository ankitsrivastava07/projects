package com.kfc.kitchen_worker.dto;

import lombok.Data;

@Data
public class ApiResponse {

    private String msg;
    private Object data;
    private Object error;
    private Boolean status;
}
