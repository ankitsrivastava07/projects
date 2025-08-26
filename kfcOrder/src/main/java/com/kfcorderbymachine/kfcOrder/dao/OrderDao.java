package com.kfcorderbymachine.kfcOrder.dao;

import com.kfcorderbymachine.kfcOrder.dto.ApiResponse;
import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;

public interface OrderDao {
    OrderEntity saveOrder(OrderEntity orderEntity);
}
