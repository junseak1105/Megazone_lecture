package Sort.j20220802;

import java.util.ArrayList;

public class List_2 {
	public String name;
	public int age;
	public String address;

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

	public List_2(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public List_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List_2 list = new List_2();
		list.setName("김재훈");
		list.setAge(26);
		list.setAddress("부산");

		System.out.println(list.getName());
		System.out.println(list.getAge());
		System.out.println(list.getAddress());
		
		System.out.println("===============");
		
		List_2 list2 = new List_2("김재훈", 20,"부산");
		System.out.println(list2.getName());
		System.out.println(list2.getAge());
		System.out.println(list2.getAddress());
		
		System.out.println("===============");
		
		ArrayList array = new ArrayList();
		array.add(list2);
		
		List_2 list3 = (List_2)array.get(0);
		
		
	}
}
