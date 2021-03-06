package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Item
 *
 * @author chen
 * @date 2019/03/02
 */
@Data
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String title;

    private String sellPoint;

    private Long price;

    private Integer num;

    private String barcode;

    private String image;

    private Long cid;

    private Byte status;

    private Date created;

    private Date updated;
}