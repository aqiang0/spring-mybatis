package com.aqiang.pojo;

public class Hello {
    private String name;

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hello() {
    }

    public Hello(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("我的名字是"+name);
    }
}
