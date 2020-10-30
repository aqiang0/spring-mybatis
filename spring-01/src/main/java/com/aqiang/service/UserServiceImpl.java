package com.aqiang.service;

import com.aqiang.dao.User;

public class UserServiceImpl implements UserService {

    //把对User类的依赖作为属性
    private User user;

    //利用set方法注入依赖
//    public void setUser(User user) {
//        this.user = user;
//    }

    //利用构造器注入依赖
    public UserServiceImpl(User user) {
        this.user = user;
    }
    //调用DAO层的方法
    public void getUser(int n) {
        System.out.println(user.getUserById(2));
    }
}
