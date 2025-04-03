package com.jkh.space.fisrt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
    /**
     * @lore
     *  - /hello 라는 문자열이 들어온다면 해당 메서드를 실행
     *  - M-Java 에서 @EventHandler 같은 역할
     * @param model < MVC <- Model View Controller 에서 M 을 책임짐
     * @return <return value>.html
     */
    @GetMapping("/test")
    public String hello(Model model){
        model.addAttribute("data","hi!");
        return "hello";
    }
    @GetMapping("/test2")
    public String tt(Model model){
        model.addAttribute("data2","TT!!");
        return "tt";
    }
    @GetMapping("/hello-mvc")
    public String mvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "mvc";
    }
}
