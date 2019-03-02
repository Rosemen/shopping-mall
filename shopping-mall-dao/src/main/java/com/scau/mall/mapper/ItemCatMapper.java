package com.scau.mall.mapper;


import com.scau.mall.entity.ItemCat;

/**
 * ItemCatMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemCat record);

    int insertSelective(ItemCat record);

    ItemCat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemCat record);

    int updateByPrimaryKey(ItemCat record);
}