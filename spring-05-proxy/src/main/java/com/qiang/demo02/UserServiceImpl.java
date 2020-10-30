package com.qiang.demo02;

//需求来了，现在我们需要给每个方法增加一个日志功能，不能改变现有代码！
//方法：设置一个代理类来处理日志！代理角色
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加一个用户");
    }

    public void del() {
        System.out.println("删除一个用户");
    }

    public void update() {
        System.out.println("更改一个用户");
    }

    public void query() {
        System.out.println("查询一个用户");
    }
}
