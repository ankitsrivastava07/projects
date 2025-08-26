package com.kfcorderbymachine.kfcOrder.repository;

import com.kfcorderbymachine.kfcOrder.entity.OrderEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface OrderRepository extends CassandraRepository<OrderEntity, String> {
}
