package com.kfc.shop_admin.controller.v1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/shop-admin")
public class ShopAdminController {

    @GetMapping
    public ResponseEntity<?> getAllOrders() {
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
