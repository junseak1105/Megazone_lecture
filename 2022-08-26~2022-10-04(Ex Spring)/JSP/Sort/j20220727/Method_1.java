package Sort.j20220727;

public class Method_1 {
	//앞으로 변수로 움직이기 금지
	//변수로 입력 출력 금지
	//메소드로 입력 출력하기
	String name;
	int age;
	String address;
	
	//method(함수):접근제한자 타입 메소드명(argument(인자))
	//get: java get 얻는다
	//set,put,add 설정,삽입,수정
	//this: 일반적으로 생략가능
	//지역변수와 전역변수 명이 같으면 생략 불가

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public static void main(String[] args) {
		Method_1 me = new Method_1();
		
		/*
		 * me.name = "김현호"; me.age=20; me.address="서울";
		 */
		me.setName("아무개");
		System.out.println(me.getName());
		
		
	}
}
