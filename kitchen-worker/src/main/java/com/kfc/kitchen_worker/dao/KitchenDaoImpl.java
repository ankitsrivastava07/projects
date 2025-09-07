package com.kfc.kitchen_worker.dao;

import com.kfc.kitchen_worker.entity.KitchenOrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KitchenDaoImpl implements KitchenDao {

    @Autowired
    private KitchenRepository kitchenRepository;

    @Override
    public KitchenOrderEntity createOrder(KitchenOrderEntity kitchenEntity) {
        return kitchenRepository.save(kitchenEntity);
    }

    @Override
    public List<KitchenOrderEntity> getAllProcessingOrders(String orderStatus) {
        return kitchenRepository.findByStatus(orderStatus);
    }

    @Override
    public KitchenOrderEntity updateOrderEntity(KitchenOrderEntity entity) {
        return kitchenRepository.save(entity);
    }
}
