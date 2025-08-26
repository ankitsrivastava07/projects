package com.eventServiceGateway.gateway.service;

import java.util.Map;

public interface EventServiceGateway {
    Map<String, Object> saveOrder(Map<String, Object> requestBody);
}
