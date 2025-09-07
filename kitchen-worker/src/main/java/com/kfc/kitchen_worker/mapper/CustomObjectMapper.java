package com.kfc.kitchen_worker.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomObjectMapper {

    private final static ObjectMapper objectMapper = new ObjectMapper();

    public static <D> D mapper(Object source , Class<D> targetType ) {
        return objectMapper.convertValue(source, targetType);
    }
}
