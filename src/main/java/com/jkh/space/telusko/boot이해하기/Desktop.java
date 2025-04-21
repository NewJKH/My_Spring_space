package com.jkh.space.telusko.boot이해하기;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void build() {
        System.out.println("Desktop is build");
    }
}
