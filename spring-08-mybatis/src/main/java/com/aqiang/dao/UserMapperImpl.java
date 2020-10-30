package com.aqiang.dao;

import com.aqiang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    //获取全部用户
    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        return users;
    }

    //获取分页用户
    public List<User> getUserLimit(Map<String,Integer> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userLimit = mapper.getUserLimit(map);
        return userLimit;
    }
}
