package com.scau.mall.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Content implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long categoryId;

    private String title;

    private String subTitle;

    private String titleDesc;

    private String url;

    private String pic;

    private String pic2;

    private Date created;

    private Date updated;

    private String content;
}