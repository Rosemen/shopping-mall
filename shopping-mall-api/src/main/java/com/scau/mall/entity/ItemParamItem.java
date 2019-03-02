package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ItemParamItem:
 *
 * @author chen
 * @date 2019/03/02
 */
@Data
public class ItemParamItem implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long itemId;

    private Date created;

    private Date updated;

    private String paramData;
}