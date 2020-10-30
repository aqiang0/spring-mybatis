package com.qiang.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//通用代理实现类
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }
    //生成代理类
    public Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                        target.getClass().getInterfaces(),
                                        this);
    }

    // proxy : 代理类
    // method : 代理类的调用处理程序的方法对象.
    public Object invoke(Object proxy, Method method, Object[] args)
                                    throws Throwable
    {
        System.out.println("增加一个日志输出");
        Object result = method.invoke(target, args);
        return result;
    }
}
