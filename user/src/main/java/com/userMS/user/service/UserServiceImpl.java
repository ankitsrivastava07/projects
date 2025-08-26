package com.userMS.user.service;

import com.userMS.user.dto.OrderRequestDto;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private

    @Override
    public Map<String, Object> createOrder(OrderRequestDto orderRequestDto) {
        return Map.of();
    }
}
