package com.kfc.shop_admin.dto.response;

import lombok.Data;

@Data
public class ApiResponse {

    private String msg;
    private Object data;
    private Object error;
    private Boolean flag;
}
