package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
// 모든 변수들을 이용해 생성자를 생성
//@AllArgsConstructor

// @NonNull 어노테이션이 붙은 변수들만을 이용해 생성자를 생성
@RequiredArgsConstructor
public class SampleHotel {
	
	@NonNull
	private Chef chef;
	
	private Chef chef2;
	
	/*
	public SampleHotel(Chef chef) { // @Autowired 가 없음.
		this.chef = chef;
	}
	*/
}
