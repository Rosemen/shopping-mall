package com.scau.mall.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private Integer uid;
    private String username;
    private String dbSource;
}
