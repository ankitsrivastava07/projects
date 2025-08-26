package com.order_queue.orderHandling.dao.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;

@Data
@Table("orders")
public class OrderEntity {

    @PrimaryKey
    private String orderId;
    private Date createdAt;
    private Date updatedAt;
    private String customerId;
    private String productId;
    private String status;
}
