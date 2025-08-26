package com.order_queue.orderHandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.order_queue.orderHandling.dto.OrderDto;
import com.order_queue.orderHandling.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/order_handler")
public class OrderHandlingController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<?> saveOrder(@RequestBody OrderDto orderDto) {
        return new ResponseEntity<>(orderService.saveOrder(orderDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllProcessingOrder() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
