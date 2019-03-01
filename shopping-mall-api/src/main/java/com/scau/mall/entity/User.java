package com.scau.mall.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String dbSource;
}
