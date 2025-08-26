package com.eventServiceGateway.gateway.controller;

import com.eventServiceGateway.gateway.service.EventServiceGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/event-gateway")
public class EventServiceGatewayController {

    @Autowired
    private EventServiceGateway eventServiceGateway;

    @PostMapping
    public ResponseEntity<?> sendSaveOrderRequest(@RequestBody Map<String, Object> requestBody) {
        return new ResponseEntity<>(eventServiceGateway.saveOrder(requestBody), HttpStatus.CREATED);
    }
}
