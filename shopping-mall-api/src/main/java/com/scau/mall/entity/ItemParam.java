package com.scau.mall.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * ItemParam
 *
 * @author chen
 * @date 2019/03/02
 */
@Data
public class ItemParam implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long itemCatId;

    private Date created;

    private Date updated;

    private String paramData;
}