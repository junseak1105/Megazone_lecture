package j20220803;

public class Static_2 {

	public static String name = "김재훈";
	public static int age = 26;
	public static String address = "부산";

	public Static_2(String name, int age, String address) {
		this.name =name;
		this.age = age;
		this.address=address;
	}
	
	

	public static String getName() {
		return name;
	}



	public static void setName(String name) {
		Static_2.name = name;
	}



	public static int getAge() {
		return age;
	}



	public static void setAge(int age) {
		Static_2.age = age;
	}



	public static String getAddress() {
		return address;
	}



	public static void setAddress(String address) {
		Static_2.address = address;
	}



	public static void main(String[] args) {
		// static:클래스명.변수나 메소드
		// 클래스명(생략가능).변수나 메소드

		
		Static_2 stat =new Static_2("이재훈",0,"집");
		
		System.out.println(stat.getName());
		System.out.println(stat.getAge());
		System.out.println(stat.getAddress());
		
	}
}
