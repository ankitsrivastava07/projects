package com.kfc.kitchen_worker.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.Map;

@Data
@Document(collection = "kitchen_order")
public class KitchenOrderEntity {

    @Id
    private String id;
    private String userId;
    private String mobile;
    private String status;
    private Double total;
    private List<Map<String, Short>> products;
}
