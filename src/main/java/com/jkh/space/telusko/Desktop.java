package com.jkh.space.telusko;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void build() {
        System.out.println("Desktop is build");
    }
}
