package j20220729;

import java.util.ArrayList;

public class List_2 {
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


	public static void main(String[] args) {
		
		List_2 list = new List_2();
		list.setName("김재훈");
		list.setAge(26);
		list.setAddress("해운대구");
		
		System.out.println(list.getName()+"\n"+list.getAge()+"\n"+list.getAddress());
		
		ArrayList array = new ArrayList();
		array.add("김재훈");
		System.out.println(String.valueOf(array.get(0)));
		
		
		System.out.println("=======================");
		array.clear();
		
		array.add(list);
		List_2 listvalue = (List_2)array.get(0);
		System.out.println(list.getName()+"\n"+list.getAge()+"\n"+list.getAddress());
		
	}
}
