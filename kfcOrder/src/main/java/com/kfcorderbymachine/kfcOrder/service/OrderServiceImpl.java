package com.kfcorderbymachine.kfcOrder.service;

import com.kfcorderbymachine.kfcOrder.dto.ApiResponse;
import com.kfcorderbymachine.kfcOrder.dto.OrderRequestDto;
import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.kfcorderbymachine.kfcOrder.util.Constant.ORDER_PROCESSING_STATUS;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public ApiResponse createOrder(OrderRequestDto orderRequestDto) {

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setCreatedAt(new Date());
        orderEntity.setMobile(orderRequestDto.getMobile());
        orderEntity.setCustomerId(orderEntity.getCustomerId());
        orderEntity.setProducts(orderRequestDto.getProducts());
        orderEntity.setOrderStatus(ORDER_PROCESSING_STATUS);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMsg("Your order is under processing ");
        apiResponse.setStatus(Boolean.TRUE);
        return apiResponse;
    }

    @Override
    public ApiResponse getAllProcessingOrders() {

        return null;
    }
}
