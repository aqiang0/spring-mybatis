package com.aqiang.dao;

public class UserImplFromOracle implements User {
    public String getUserById(int n) {
        return "从Oracle数据库查询回来的数据"+n;
    }
}
