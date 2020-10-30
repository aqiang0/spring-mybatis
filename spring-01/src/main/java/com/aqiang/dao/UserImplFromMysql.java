package com.aqiang.dao;
//实现接口具体的操作，这里一般是利用jdbc从数据库拿数据
public class UserImplFromMysql implements User {
    public String getUserById(int n) {
        return "从mysql数据库查询回来的数据"+n;
    }
}
