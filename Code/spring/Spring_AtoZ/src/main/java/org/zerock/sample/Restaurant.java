package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data // 컴파일시, setter, 생성자 등을 만들어줌.
public class Restaurant {
	// 객체간의 의존 관계 설정 - 생성자 또는 setter를 이용
	@Setter(onMethod_ = @Autowired) // 의존 주입
	private Chef chef;
}