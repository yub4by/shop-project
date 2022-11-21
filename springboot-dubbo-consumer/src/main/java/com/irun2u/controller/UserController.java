package com.irun2u.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.irun2u.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: haifei
 * @Date: 2022/11/21 15:59
 */
@RestController //此处响应数据，而不跳转页面
@RequestMapping("/user")
public class UserController {

    @Reference //dubbo远端注入
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(String name){
        return userService.sayHello(name);
    }
}
