package com.order_queue.orderHandling.service;

import com.order_queue.orderHandling.dao.OrderDao;
import com.order_queue.orderHandling.dao.entity.OrderEntity;
import com.order_queue.orderHandling.dto.ApiResponse;
import com.order_queue.orderHandling.dto.OrderDto;
import com.order_queue.orderHandling.mapper.CustomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public ApiResponse saveOrder(OrderDto orderDto) {
        OrderEntity orderEntity = CustomMapper.mapper(orderDto, OrderEntity.class);
        orderEntity = orderDao.saveOrder(orderEntity);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(orderEntity);
        apiResponse.setFlag(Boolean.TRUE);
        apiResponse.setMsg("Success");
        return apiResponse;
    }

    @Override
    public ApiResponse getAllProcessingOrder() {
        return null;
    }
}
