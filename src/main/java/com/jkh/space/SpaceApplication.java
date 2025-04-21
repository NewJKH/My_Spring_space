package com.jkh.space;

import com.jkh.space.telusko.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpaceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpaceApplication.class, args);
		/*
			이 코드에서 알려주고 싶었던 점
			Dev dev = new Dev(); 해서 새로운 객체를 생성하는 것도 가능하지만
			dev.build()

			우리는 스프링을 사용하기에
			Bean 에 객체를 등록하는 방법을 알아야한다. ( 즉 싱글톤

				Dev dev = context.getBean(Dev.class);

			dev.build();
		 */
		Dev dev = context.getBean(Dev.class);
		dev.build();
		dev.on();

	}

}
