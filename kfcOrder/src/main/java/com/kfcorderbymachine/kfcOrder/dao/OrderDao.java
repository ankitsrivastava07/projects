package com.kfcorderbymachine.kfcOrder.dao;

import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;

import java.util.List;

public interface OrderDao {

    OrderEntity saveOrder(OrderEntity orderEntity);

    List<OrderEntity> getAllProcessingOrders();
}
