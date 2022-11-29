package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //아래의 어노테이션과 동일
//@SpringBootConfiguration  // 지정된 클래스는 스프링부트의 환경설정 빈, @Configuration과 동일
//@ComponentScan //개발자가 만든 클래스를 스캔하여 빈으로 등록, @Controller, @Service, @Repository, @Component
//@EnableAutoConfiguration //자동설정 관련 처리, spring.factories 파일에 등록된 클래스를 스캔하여 빈으로 등록
public class BootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}
