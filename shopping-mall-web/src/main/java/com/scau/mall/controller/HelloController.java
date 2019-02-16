package com.scau.mall.controller;

import com.scau.mall.entity.User;
import com.scau.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get/{username}",method = RequestMethod.GET)
    public User get(@PathVariable("username") String username){
        return userService.get(username);
    }
}
