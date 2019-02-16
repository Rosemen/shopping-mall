package com.scau.mall.service.impl;

import com.scau.mall.entity.User;
import com.scau.mall.mapper.UserMapper;
import com.scau.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User get(String username) {
        return userMapper.get(username);
    }
}
