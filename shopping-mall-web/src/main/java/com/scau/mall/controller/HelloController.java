package com.scau.mall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.scau.mall.entity.User;
import com.scau.mall.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * HelloController:用户处理器
 * @Reference(group = "first")：调用zookeeper上分组号为first的服务
 *
 * @author chen
 * @date 2019/03/01
 */
@RestController
public class HelloController {
    @Reference(group = "first")
    private UserService userService;

    @RequestMapping(value = "/get/{username}",method = RequestMethod.GET)
    public User get(@PathVariable("username") String username){
        return userService.get(username);
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> list(){

        List<User> userList = userService.list();

        return userList;
    }
}
