package com.scau.mall.mapper;


import com.scau.mall.entity.OrderItem;

/**
 * OrderItemMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface OrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}