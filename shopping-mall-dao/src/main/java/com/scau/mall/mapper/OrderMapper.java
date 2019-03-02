package com.scau.mall.mapper;


import com.scau.mall.entity.Order;
/**
 * OrderMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface OrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}