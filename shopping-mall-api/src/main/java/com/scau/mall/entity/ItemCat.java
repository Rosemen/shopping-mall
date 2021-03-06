package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ItemCat
 *
 * @author chen
 * @date 2019/03/02
 */
@Data
public class ItemCat implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Date created;

    private Date updated;
}