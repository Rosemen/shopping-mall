package com.scau.mall.service;

import com.github.pagehelper.PageInfo;
import com.scau.mall.entity.User;

/**
 * UserService:用户业务接口
 *
 * @author chen
 * @date 2019/03/01
 */
public interface UserService {
     /**
      * 根据用户名查询用户
      *
      * @param username
      * @return User
      */
     User get(String username);

     /**
      * 分页查询所有用户
      *
      * @return PageInfo<User>
      */
     PageInfo<User> list();
}
