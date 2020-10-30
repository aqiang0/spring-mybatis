package com.qiang.demo01;

public class RentProxy implements Rent{
    //注入房东，代理他
    private Host host;

    public RentProxy(){}
    public RentProxy(Host h){
        this.host = h;
    }
    public void rent() {
        seeHouse();
        host.rent();
    }

    //代理的其他功能
    public void seeHouse(){
        System.out.println("代理带你去看房");
    }
}
