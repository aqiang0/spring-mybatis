package com.aqiang.dao;

import com.aqiang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUsers();
    List<User> getUserLimit(Map<String,Integer> map);
}
