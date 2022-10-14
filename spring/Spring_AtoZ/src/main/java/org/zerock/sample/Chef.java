package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component // 스프링에서 관리해야 할 대상 객체(빈)임을 표시하는 어노테이션.
@Data // Lombok의 setter, 생성자, toString() 메소드 자동 생성.
public class Chef {
	public Chef() {
		
	}
}