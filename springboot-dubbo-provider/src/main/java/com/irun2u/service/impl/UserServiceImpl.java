package com.irun2u.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.irun2u.service.UserService;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;

/**
 * @Author: haifei
 * @Date: 2022/11/9 9:44
 */
//@Service
@Service(interfaceClass = UserService.class)
@Component //为了区分dubbo的service注解，用Component替换spring的service注解
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "hello: " + name;
    }
}
