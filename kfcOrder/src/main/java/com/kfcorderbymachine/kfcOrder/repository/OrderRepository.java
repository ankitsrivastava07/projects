package com.kfcorderbymachine.kfcOrder.repository;

import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import java.util.List;

public interface OrderRepository extends CassandraRepository<OrderEntity, String> {

    List<OrderEntity> findByOrderStatus(String orderStatus);
}
