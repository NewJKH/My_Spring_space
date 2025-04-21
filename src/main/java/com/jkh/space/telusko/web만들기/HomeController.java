package com.jkh.space.telusko.web만들기;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /**
     * @RestController 와
     * @Controller 는 엄연히 다름
     *
     * @GetMapping("/") 했을 경우
     *
     * @Controller 는 return 할때 웹 페이지 주소를 반환하고 즉 "Hello World.html" 을 찾고 있는거임
     * @RestController 는 return 할때 웹 페이지 주소가 아닌 데이터를 반환하는 스타일임.
     */

    /**
     * @GetMapping 과
     * @RequestMapping 의 차이점
     *
     *   @RequestMapping 은 가장 범용적인 것
     *   @GetMapping = @RequestMapping(method=RequestMethod.GET) 의 축약 버전
     *
     */

    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Hello World";
    }

    @RequestMapping("/about")
    public String about(){
        return "WE dont teach, we Educate";
    }
}
