package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Order:订单
 *
 * @author chen
 * @date 2019/03/02
 */
@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    private String orderId;

    private String payment;

    private Integer paymentType;

    private String postFee;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Date paymentTime;

    private Date consignTime;

    private Date endTime;

    private Date closeTime;

    private String shippingName;

    private String shippingCode;

    private Long userId;

    private String buyerMessage;

    private String buyerNick;

    private Integer buyerRate;
}