package com.scau.mall.mapper;


import com.scau.mall.entity.Content;

/**
 * ContentMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKeyWithBLOBs(Content record);

    int updateByPrimaryKey(Content record);
}