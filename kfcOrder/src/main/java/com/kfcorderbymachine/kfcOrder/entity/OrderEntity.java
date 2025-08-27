package com.kfcorderbymachine.kfcOrder.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.Map;

@Data
@Table("orders")
public class OrderEntity {

    @PrimaryKey
    private Long id;
    private String token;
    private Map<String, Integer> products;
    private String customerId;
    private Date createdAt;
    private String mobile;
    private String orderStatus;
    private Boolean flag;
}
