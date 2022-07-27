package j20220727;

public class GlobalVal_1 {
	// 전역변수, 클래스 변수, 필드 변수(api)
	// 접근 제한자 타입 변수명
	// 접근 제한자 : public -> 누구나 접근할 수 있다, protected->해당하는 패키지만, private-> 현재 클래스
	// 전역변수는 변수 선언만 해도 된다
	String name = "김현호";
	int age = 26;
	String address = "해운대구";
	
	public static void main(String[] args) {
		
		int age = 26;
		String address = "해운대구";
		//지역변수: 괄호가 닫히면 소멸한다
		System.out.println("나이:"+age);
		System.out.println("주소:"+address);
		
		GlobalVal_1 gl = new GlobalVal_1();
		System.out.println("이름:"+gl.name);
		System.out.println("나이:"+gl.age);
		System.out.println("주소:"+gl.address);
		//객체지향: 큰곳에서 작은 곳으로 간다
		//자바에서 큰곳에서 작은것은 .으로 간다
		
		
	}
}
