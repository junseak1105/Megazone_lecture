package Sort.j20220728;

public class Ctr_1 {

	/*
	 * 메소드: 메소드는 반드시 괄호가 있다 변수는 괄호가 없다 메소드는 여러 타입을 받을 수 있다 변수는 움직일 수 없다 메소드를 통해서
	 * 움직인다
	 * 
	 */
	String name;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// public Ctr_1() {
//		System.out.println("기본생성자");
//	}
	public Ctr_1(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {

		// argument가 있는 생성자가 오면 기본 생성자는 생략할 수 없다
		// Ctr_1 ctr = new Ctr_1();
		Ctr_1 ctr2 = new Ctr_1("김재훈", "해운대");
	}
}
