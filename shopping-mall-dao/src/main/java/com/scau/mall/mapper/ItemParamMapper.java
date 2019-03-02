package com.scau.mall.mapper;


import com.scau.mall.entity.ItemParam;

/**
 * ItemParamMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemParam record);

    int insertSelective(ItemParam record);

    ItemParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemParam record);

    int updateByPrimaryKeyWithBLOBs(ItemParam record);

    int updateByPrimaryKey(ItemParam record);
}