package com.jkh.space.fisrt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
    RestController

 */
@RestController
public class FirstRestController {
    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
