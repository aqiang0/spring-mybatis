package com.qiang.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log();
        userService.add();
    }

    public void del() {
        log();
        userService.del();
    }

    public void update() {
        log();
        userService.update();
    }

    public void query() {
        log();
        userService.query();
    }

    public void log(){
        System.out.println("输出日志");
    }
}
