package com.order_queue.orderHandling.service;

import com.order_queue.orderHandling.dto.ApiResponse;
import com.order_queue.orderHandling.dto.OrderDto;

public interface OrderService {

    ApiResponse saveOrder(OrderDto orderDto);

    ApiResponse getAllProcessingOrder();
}
