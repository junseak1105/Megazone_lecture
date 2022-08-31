package Sort.j20220728;

public class Gwang_2 {
	String name;
	int age;
	String address;
	
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
	public Gwang_2(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public static void main(String[] args) {
		String name ="김재훈";
		int age= 20;
		String address = "서울";
		
		Gwang_2 gw = new Gwang_2(name,age,address);
		System.out.println("이름:"+gw.name);
		System.out.println("나이:"+gw.age);
		System.out.println("주소:"+gw.address);
	}
}
