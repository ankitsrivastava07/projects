package com.kfc.kitchen_worker.service;

import com.kfc.kitchen_worker.dto.ApiResponse;
import com.kfc.kitchen_worker.dto.CreateOrder;
import com.kfc.kitchen_worker.dto.UpdateOrderReqDto;

public interface KitchenService {

    //ApiResponse createOrderReq(CreateOrder createOrder);

    ApiResponse getAllProcessingOrders(String orderStatus);

    ApiResponse updateOrderStatus(UpdateOrderReqDto updateOrderReqDto);
}
