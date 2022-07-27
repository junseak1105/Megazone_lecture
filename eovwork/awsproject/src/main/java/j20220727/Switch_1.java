package j20220727;

public class Switch_1 {
	public static void main(String[] args) {
		switch (1) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("값 없음");
			break;
		}
		System.out.println("======================");
		String name = "김재훈";
		switch (name) {
		case "김재훈":
			System.out.println(name + " 검색됨");
			break;
		case "아무개":
			System.out.println(name + " 검색됨");
			break;
		case "홍길동":
			System.out.println(name + " 검색됨");
			break;
		default:
			System.out.println(name+"검색결과 없음");
			break;
		}
		
		System.out.println("======================");
		char firstname='김';
		
		switch (firstname) {
		case '김':
			System.out.println(firstname + " 검색됨");
			break;
		case '이':
			System.out.println(firstname + " 검색됨");
			break;
		case '박':
			System.out.println(firstname + " 검색됨");
			break;
		default:
			System.out.println(firstname+"검색결과 없음");
			break;
		}
		
	}
}
