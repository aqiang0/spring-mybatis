package com.qiang.demo02;

import org.junit.Test;

public class MyTest {
    @Test
    public  void test1(){
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.add();
        proxy.del();
        proxy.update();
        proxy.query();
    }

    @Test
    public  void test2(){
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理对象的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类！
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
