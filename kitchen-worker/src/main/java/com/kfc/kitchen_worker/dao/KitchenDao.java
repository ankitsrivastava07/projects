package com.kfc.kitchen_worker.dao;

import com.kfc.kitchen_worker.entity.KitchenOrderEntity;

import java.util.List;

public interface KitchenDao {

    KitchenOrderEntity createOrder(KitchenOrderEntity kitchenEntity);

    List<KitchenOrderEntity> getAllProcessingOrders(String orderStatus);

    KitchenOrderEntity updateOrderEntity(KitchenOrderEntity entity);
}
