package com.kfc.kitchen_worker.dto;

import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class CreateOrder {

    private String status;
    private String userId;
    private String mobile;
    private Double total;
    private List<Map<String, Integer>> products;
}
