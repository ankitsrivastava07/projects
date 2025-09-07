package com.kfc.kitchen_worker.dao;

import com.kfc.kitchen_worker.entity.KitchenOrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface KitchenRepository extends MongoRepository<KitchenOrderEntity, String> {

    List<KitchenOrderEntity> findByStatus(String orderStatus);
}
