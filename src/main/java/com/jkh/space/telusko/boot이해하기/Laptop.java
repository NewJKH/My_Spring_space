package com.jkh.space.telusko.boot이해하기;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void build(){
        System.out.println("Laptop is build");
    }
}
