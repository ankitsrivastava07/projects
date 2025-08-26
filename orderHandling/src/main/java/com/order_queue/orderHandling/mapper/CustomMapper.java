package com.order_queue.orderHandling.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

public class CustomMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static <D> D mapper(Object source, Class<D> target) {
        return modelMapper.map(source, target);
    }
}
