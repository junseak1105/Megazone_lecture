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
// ��� �������� �̿��� �����ڸ� ����
//@AllArgsConstructor

// @NonNull ������̼��� ���� �����鸸�� �̿��� �����ڸ� ����
@RequiredArgsConstructor
public class SampleHotel {
	
	@NonNull
	private Chef chef;
	
	private Chef chef2;
	
	/*
	public SampleHotel(Chef chef) { // @Autowired �� ����.
		this.chef = chef;
	}
	*/
}
