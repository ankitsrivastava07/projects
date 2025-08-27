package com.kfcorderbymachine.kfcOrder.service;

import com.kfcorderbymachine.kfcOrder.dao.OrderDao;
import com.kfcorderbymachine.kfcOrder.dto.ApiResponse;
import com.kfcorderbymachine.kfcOrder.dto.OrderRequestDto;
import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.kfcorderbymachine.kfcOrder.util.Constant.ORDER_PROCESSING_STATUS;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

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
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(orderDao.getAllProcessingOrders());
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg("Success");
        return apiResponse;
    }
}
