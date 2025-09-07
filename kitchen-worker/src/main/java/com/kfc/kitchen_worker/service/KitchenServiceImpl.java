package com.kfc.kitchen_worker.service;

import com.kfc.kitchen_worker.dao.KitchenDao;
import com.kfc.kitchen_worker.dto.ApiResponse;
import com.kfc.kitchen_worker.dto.UpdateOrderReqDto;
import com.kfc.kitchen_worker.entity.KitchenOrderEntity;
import com.kfc.kitchen_worker.mapper.CustomObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

@Service
public class KitchenServiceImpl implements KitchenService {

    @Autowired
    private KitchenDao kitchenDao;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Override
    public ApiResponse getAllProcessingOrders(String orderStatus) {

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg("Success");

        if (Objects.nonNull(redisTemplate.opsForValue().get("order_by_machine"))) {
            apiResponse.setData(redisTemplate.opsForValue().get("order_by_machine"));
            return apiResponse;
        }
        Object result = kitchenDao.getAllProcessingOrders(orderStatus);
        apiResponse.setData(result);
        redisTemplate.opsForValue().set("order_by_machine", result, 1, TimeUnit.MINUTES);
        return apiResponse;
    }

    @Override
    public ApiResponse updateOrderStatus(UpdateOrderReqDto updateOrderReqDto) {

        KitchenOrderEntity entity = CustomObjectMapper.mapper(updateOrderReqDto, KitchenOrderEntity.class);
        entity = kitchenDao.updateOrderEntity(entity);
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setData(entity);

        apiResponse.setStatus(Boolean.TRUE);
        apiResponse.setMsg("Success");
        return apiResponse;
    }

}
