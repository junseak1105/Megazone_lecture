package j20220729;

import java.util.ArrayList;

public class List_3 {

	String name;
	int age;
	String address;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	public List_3(String name, int age, String address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		List_3 list = new List_3("김재훈",26,"부산");
		
		array.add(list);
		List_3 listvalue = (List_3)array.get(0);
		System.out.println(listvalue.name);
		System.out.println(listvalue.age);
		System.out.println(listvalue.address);
		
	}
}
