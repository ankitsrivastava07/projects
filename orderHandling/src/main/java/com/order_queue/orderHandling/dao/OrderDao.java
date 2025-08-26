package com.order_queue.orderHandling.dao;

import com.order_queue.orderHandling.dao.entity.OrderEntity;

import java.util.List;

public interface OrderDao {

    OrderEntity saveOrder(OrderEntity orderEntity);

    List<OrderEntity> getAllProcessingOrder();
}
