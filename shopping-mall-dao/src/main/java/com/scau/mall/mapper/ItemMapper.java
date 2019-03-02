package com.scau.mall.mapper;


import com.scau.mall.entity.Item;

/**
 * ItemMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}