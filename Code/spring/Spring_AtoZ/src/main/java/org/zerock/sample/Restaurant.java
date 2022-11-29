package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data // �����Ͻ�, setter, ������ ���� �������.
public class Restaurant {
	// ��ü���� ���� ���� ���� - ������ �Ǵ� setter�� �̿�
	@Setter(onMethod_ = @Autowired) // ���� ����
	private Chef chef;
}