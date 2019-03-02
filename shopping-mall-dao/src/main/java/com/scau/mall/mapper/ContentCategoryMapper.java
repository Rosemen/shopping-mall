package com.scau.mall.mapper;


import com.scau.mall.entity.ContentCategory;

/**
 * ContentCategoryMapper
 *
 * @author chen
 * @date 2019/03/02
 */
public interface ContentCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContentCategory record);

    int insertSelective(ContentCategory record);

    ContentCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContentCategory record);

    int updateByPrimaryKey(ContentCategory record);
}