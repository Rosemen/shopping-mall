package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ItemDesc implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long itemId;

    private Date created;

    private Date updated;

    private String itemDesc;
}