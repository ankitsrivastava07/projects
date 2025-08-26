package com.userMS.user.entity;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@Data
@Table("orders")
public class OrderEntity {

    private String id;
    private List<String> productId;
    private String userId;
    private String status;
}
