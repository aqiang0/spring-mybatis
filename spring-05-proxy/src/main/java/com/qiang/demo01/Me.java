package com.qiang.demo01;

public class Me {
    public static void main(String[] args) {
        Host host = new Host();
        //Me类直接面对代理，依旧达到了调用Host类的方法，并且代理还能帮助做其他事情
        RentProxy rentProxy = new RentProxy(host);
        rentProxy.rent();
    }

}
