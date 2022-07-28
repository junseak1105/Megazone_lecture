package j20220728;
import java.io.*;

public class InputOut_1 {
	String name;
	int age;
	String address;
	
	public InputOut_1(String name, int age, String addresss) {
		this.name = name;
		this.age = age;
		this.address =addresss;
	}
	public static void main(String[] args) throws IOException {
		
		//에러 처리: 입출력(io), network(chat),instance(new) 에러 강제 처리
		//Exception: 모든 에러 처리 담당 부모
		BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 입력:");
		String name = buffer.readLine();
		System.out.print("\n주소 입력:");
		String address = buffer.readLine();
		System.out.print("\n나이 입력:");
		int age = Integer.parseInt(buffer.readLine());
		System.out.println();

		//이름, 나이, 주소, 생성자
		InputOut_1 io = new InputOut_1(name, age, address);
		System.out.println("이름:"+io.name);
		System.out.println("나이:"+io.age);
		System.out.println("주소:"+io.address);
	}
}
