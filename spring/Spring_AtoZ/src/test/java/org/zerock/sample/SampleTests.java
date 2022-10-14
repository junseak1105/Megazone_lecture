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

// JUnit 프레임워크의 실행방법을 확장시 사ㅣ용하는 어노테이션
// JUnit이 테스트를 진행하는 중에 사용할 애플리케이션 컨텍스트를 생성하고 관리하는 작업을 진행.
@RunWith(SpringJUnit4ClassRunner.class)
// 지정한 경로의 root-context.xml로부터 필요한 클래스를 스프링의 빈으로 등록
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class SampleTests {
	
	//@Autowired 는 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해달라는 표시의 어노테이션
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	// JUnit에서 아래의 메소드가 단위 테스트 대상임을 나타내는 어노테이션
	@Test
	public void testExist() {
		// resaurant 인스턴스 변수가 정상적으로 초기화되었는지를 확인.
		// null 아니면, 정상적으로 DI가 이루어진 것임.
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("----------------------------");
		log.info(restaurant.getChef());
	}
}
