package com.eventServiceGateway.gateway.dto;

import lombok.Data;
import java.util.Map;

@Data
public class SaveOrderRequest {

    private Map<String, Object> request;
}
