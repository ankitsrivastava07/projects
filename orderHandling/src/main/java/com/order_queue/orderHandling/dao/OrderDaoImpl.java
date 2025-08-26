package com.order_queue.orderHandling.dao;

import com.order_queue.orderHandling.dao.entity.OrderEntity;
import com.order_queue.orderHandling.dao.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity saveOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }

    @Override
    public List<OrderEntity> getAllProcessingOrder() {
        return orderRepository.getAllProcessing("");
    }


}
