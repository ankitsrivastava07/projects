package com.order_queue.orderHandling.dao.repository;

import com.order_queue.orderHandling.dao.entity.OrderEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import java.util.List;

public interface OrderRepository extends CassandraRepository<OrderEntity, String> {

    @Query(value = "select * from orders where status = ?0")
    List<OrderEntity> getAllProcessing(String orderStatus);
}
