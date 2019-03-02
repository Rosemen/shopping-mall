package com.scau.mall.mapper;


import com.scau.mall.entity.User;

import java.util.List;

/**
 * UserMapper:用户操作数据库接口
 *
 * @author chen
 * @date 2019/03/01
 */
public interface UserMapper {
    /**
     * 根据用户名从数据库中查询用户
     *
     * @param username
     * @return User
     */
    User get(String username);

    List<User> list();
}
