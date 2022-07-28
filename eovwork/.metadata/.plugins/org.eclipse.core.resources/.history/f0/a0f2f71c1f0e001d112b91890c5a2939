package j20220728;


//Object: 모든 클래스는 반드시 상속받는다
//클래스는 하나만 받을 수 있다
//Object는 생략이 가능하다
//java는 Object 상속받지 않으면 native
public class Object_2 extends Object{

	public static void main(String[] args) {

		String name = "김재훈";
		System.out.println(name);
		Object name2 = "아무개"; //Object는 모든 타입을 가질 수 있다.
		
		System.out.println(name2.getClass().getName());
		
		//wrapper class
		//반드시 객체나 static을 통해서만 변수가 메소드 호출이 가능하다
		
		//static: 클래스명.변수클래스명.메소드명
		//String -> int
		int age = 20;
		Integer age2=30;
		int age3 = age2.parseInt("12345");
		System.out.println(age3);
		
		//int -> String
		String intvalue = String.valueOf(age3);
		System.out.println(intvalue.getClass().getName());
		
	}
}
