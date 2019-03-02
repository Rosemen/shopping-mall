package com.scau.mall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.scau.mall.entity.User;
import com.scau.mall.mapper.UserMapper;
import com.scau.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * UserServiceImpl:用户业务接口实现类
 *
 * @author chen
 * @Service(group = "first")：将服务注册到zookeeper,并设置分组
 * @date 2019/03/01
 */
@Transactional
@Component
@Service(group = "first")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User get(String username) {
        return userMapper.get(username);
    }

    @Override
    public List<User> list() {
        /*PageHelper.startPage(0,4);*/
        List<User> userList = userMapper.list();
        return userList;
    }
}
