package com.kfcorderbymachine.kfcOrder.dao;

import com.kfcorderbymachine.kfcOrder.dto.ApiResponse;
import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;
import com.kfcorderbymachine.kfcOrder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity saveOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }
}
