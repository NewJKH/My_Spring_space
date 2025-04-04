package com.jkh.space.fisrt.controller;

import com.jkh.space.fisrt.domain.test.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    /**
     * @param name < http://localhost:8080/data?name=zzzzz 해당 URL 을 준다면
     * @return hello@@@@@@@zzzzz 를 화면에 글자로 띄워준다.
     */
    @GetMapping("/data")
    @ResponseBody
    public String helloString(@RequestParam("name")String name){
        return "hello@@@@@@@"+name;
    }

    /**
      * @param name 첫번째 신계에 일단 이거 GET 방식이고 위에 처럼 URL 에 값을 넣어줌
     * @return 객체를 반환하고 있는데 이걸 Json 형식으로 반환함!
     */
    @GetMapping("hello-api")
    @ResponseBody
    public Hello getApi(@RequestParam("name") String name){
        return new Hello(name);
    }
}
