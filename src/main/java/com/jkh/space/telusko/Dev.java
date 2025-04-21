package com.jkh.space.telusko;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    /*
        laptop 을 만들었을 경우 새로운 객체로 생성한다면 ?
        Laptop laptop = new Laptop(); ( 이전에 자바할때는 추천되었지만, 지금은 아님 ( 상황에 따라 다를 수 있음 ))

        OK
        IF 만약에
            내가 여기서 새로운 객체를 생성하고  Laptop 에 가서 @Component 를 선언한다면?
            그건 객체가 하나일까? 아니면 Bean 에 등록된 것 포함해서 2개 일까? ( 2개가 된다. )

            좋다. 그러면 내가 새로운 객체를 생성안한다면 null 이 뜰것이다.

            그럼 그거를 어떻게 해결하느냐?
            정답은
            @Autowired 다.
     */

    // @Autowired / 필드 인젝션 방법 , 즉 Autowired 를 해서 자동으로 주입시켜주는 것이 필드 인젝션이다.
    Laptop laptop;

    // 이 방법은 컨스트럭쳐 인젝션 , 즉, 생성자에서 받아서 활성화 시켜주는 것 우리가 아는 흔히 말하는 DI 대표적인 방법이다.
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
     // 이 방법은 Setter 익젝션, 즉 설정해줄 때 받아서 활성화 시켜준다.
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void on(){
        laptop.build();
    }

    public void build(){
        System.out.println("working on Awesome Project");
    }
}
