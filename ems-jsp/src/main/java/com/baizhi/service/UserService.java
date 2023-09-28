package com.baizhi.service;

import com.baizhi.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    //用户注册
    void register(User user);

    //用户登录
    User login(String username, String password);
}
