package Sort.j20220726;

/*
 * 1.작성자:김재훈

 * 2.작성일:2022-07-26

 * 3.수정일:2022-07-26

 */

public class Var_1 {
	public static void main(String[] args) {
		
		System.out.println("안녕하세요 반가워요 ");

		//	이름 나이 주소 출력
		String name = "김재훈";
		String age = "26";
		String address = "해운대구";

		/*
		 * 
		 * 자바입장
		 * 변수: 오른쪽에서 왼쪽
		 * 오른쪽이 문자열이면 자바에서는 String 받는다
		 * 변수는 변할 수 있다. 변하지 않는 수는 상수(final)
		 * 
		 */
		
		System.out.println("이름은:"+name);
		name ="이순신";
		System.out.println("이름은:"+name);
		
		//친구 이름 나이 주소 만들고 출력(재선언??)
		System.out.println("내 이름:"+name);
		System.out.println("내 나이:"+age);
		System.out.println("내 주소:"+address);
		
		name = "이순신";
		age = "26";
		address="중동";
		
		System.out.println("친구 이름:"+name);
		System.out.println("친구 나이:"+age);
		System.out.println("친구 주소:"+address);
		
		
	}
}