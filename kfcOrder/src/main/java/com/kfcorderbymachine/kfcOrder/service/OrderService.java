package com.kfcorderbymachine.kfcOrder.service;

import com.kfcorderbymachine.kfcOrder.dto.ApiResponse;
import com.kfcorderbymachine.kfcOrder.dto.OrderRequestDto;

public interface OrderService {

    ApiResponse createOrder(OrderRequestDto orderRequestDto);

    ApiResponse getAllProcessingOrders();
}
