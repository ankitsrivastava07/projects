package com.userMS.user.service;

import com.userMS.user.dto.OrderRequestDto;
import java.util.Map;

public interface UserService {

    Map<String, Object> createOrder(OrderRequestDto orderRequestDto);
}
