package com.eventServiceGateway.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/event-gateway")
public class EventServiceGatewayController {

    @PostMapping
    public ResponseEntity<?> sendSaveOrderRequest(@RequestBody Map<String, Object> requestBody) {

        return null;
    }
}
