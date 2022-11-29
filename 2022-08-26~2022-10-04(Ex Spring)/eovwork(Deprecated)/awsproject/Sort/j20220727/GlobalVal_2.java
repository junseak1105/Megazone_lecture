package Sort.j20220727;

public class GlobalVal_2 {

	// 변수 선언
	String name;
	int age;
	String address;

	public static void main(String[] args) {
		String name = null;
		int age = 0;
		String address = null;

		System.out.println(name);
		System.out.println(age);
		System.out.println(address);

		System.out.println("==============");
		GlobalVal_2 gl = new GlobalVal_2();
		System.out.println(gl.name);
		System.out.println(gl.age);
		System.out.println(gl.address);

		// gwang1
		Gwang_1 gw = new Gwang_1();
		System.out.println(gw.name);
		System.out.println(gw.age);
		System.out.println(gw.address);
		
		//package:questionpool
		//class:Gwang_2
		//이름 나이 주소 입력하고 출력
	}

}
