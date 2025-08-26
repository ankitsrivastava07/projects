package com.kfcorderbymachine.kfcOrder.controller;

import com.kfcorderbymachine.kfcOrder.dto.OrderRequestDto;
import com.kfcorderbymachine.kfcOrder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody OrderRequestDto orderRequestDto) {
        return new ResponseEntity<>(orderService.createOrder(orderRequestDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllProcessingOrders() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
