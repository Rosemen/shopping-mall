package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * OrderItem: 订单条目
 *
 * @author chen
 * @date 2019/03/02
 */
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