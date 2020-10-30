package com.aqiang.pojo;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog {
    public void shout(){
        System.out.println("汪汪---------");
    }
}
