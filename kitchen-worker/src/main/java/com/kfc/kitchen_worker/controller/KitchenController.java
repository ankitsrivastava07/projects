package com.kfc.kitchen_worker.controller;

import com.kfc.kitchen_worker.dto.UpdateOrderReqDto;
import com.kfc.kitchen_worker.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kitchen")
public class KitchenController {

    @Autowired
    private KitchenService kitchenService;

    @GetMapping
    public ResponseEntity<?> getAllProcessingOrders(@RequestParam String orderStatus) {
        return new ResponseEntity<>(kitchenService.getAllProcessingOrders(orderStatus), HttpStatus.CREATED);
    }

    @PatchMapping("/order/{orderId}")
    public ResponseEntity<?> updateOrderStatus(@PathVariable String orderId, @RequestBody UpdateOrderReqDto updateOrderReqDto) {
        return new ResponseEntity<>(kitchenService.updateOrderStatus(updateOrderReqDto), HttpStatus.CREATED);
    }
}
