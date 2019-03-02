package com.scau.mall.mapper;


import com.scau.mall.entity.ItemParamItem;

/**
 * ItemParamItemMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ItemParamItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemParamItem record);

    int insertSelective(ItemParamItem record);

    ItemParamItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(ItemParamItem record);

    int updateByPrimaryKey(ItemParamItem record);
}