package com.eventServiceGateway.gateway.service;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class EventServiceGatewayImpl implements EventServiceGateway {

    @Override
    public Map<String, Object> saveOrder(Map<String, Object> requestBody) {
        return Map.of();
    }
}
