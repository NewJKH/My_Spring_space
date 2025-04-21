package com.jkh.space.telusko.boot이해하기;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet() {
        return "Hello World, Welcome";
    }
}
