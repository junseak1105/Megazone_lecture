package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

// JUnit �����ӿ�ũ�� �������� Ȯ��� ��ӿ��ϴ� ������̼�
// JUnit�� �׽�Ʈ�� �����ϴ� �߿� ����� ���ø����̼� ���ؽ�Ʈ�� �����ϰ� �����ϴ� �۾��� ����.
@RunWith(SpringJUnit4ClassRunner.class)
// ������ ����� root-context.xml�κ��� �ʿ��� Ŭ������ �������� ������ ���
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class SampleTests {
	
	//@Autowired �� �ش� �ν��Ͻ� ������ ���������κ��� �ڵ����� �����ش޶�� ǥ���� ������̼�
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	// JUnit���� �Ʒ��� �޼ҵ尡 ���� �׽�Ʈ ������� ��Ÿ���� ������̼�
	@Test
	public void testExist() {
		// resaurant �ν��Ͻ� ������ ���������� �ʱ�ȭ�Ǿ������� Ȯ��.
		// null �ƴϸ�, ���������� DI�� �̷���� ����.
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("----------------------------");
		log.info(restaurant.getChef());
	}
}
