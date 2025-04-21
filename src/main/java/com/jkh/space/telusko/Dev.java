package com.jkh.space.telusko;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    Laptop laptop;;

    public void on(){
        System.out.println("Laptop is on");
    }

    public void build(){
        System.out.println("working on Awesome Project");
    }
}
