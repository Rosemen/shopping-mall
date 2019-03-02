package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private String itemId;

    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;
}