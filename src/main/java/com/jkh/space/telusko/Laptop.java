package com.jkh.space.telusko;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void build(){
        System.out.println("Laptop is build");
    }
}
