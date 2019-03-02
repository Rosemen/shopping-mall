package com.scau.mall.mapper;


import com.scau.mall.entity.ItemDesc;

/**
 * ItemDescMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ItemDescMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(ItemDesc record);

    int insertSelective(ItemDesc record);

    ItemDesc selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(ItemDesc record);

    int updateByPrimaryKeyWithBLOBs(ItemDesc record);

    int updateByPrimaryKey(ItemDesc record);
}