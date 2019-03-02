package com.scau.mall.mapper;


import com.scau.mall.entity.OrderShipping;

/**
 * OrderShippingMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface OrderShippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderShipping record);

    int insertSelective(OrderShipping record);

    OrderShipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderShipping record);

    int updateByPrimaryKey(OrderShipping record);
}