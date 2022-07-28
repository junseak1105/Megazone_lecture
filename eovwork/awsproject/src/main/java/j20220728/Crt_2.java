package j20220728;

import java.util.*;

public class Crt_2 {
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
	
	public Crt_2(String name, String address) {
		this.name= name;
		this.address=address;
	}

	public static void main(String[] args) {
		
		Crt_2 ctrl = new Crt_2("name","address");
		System.out.println(ctrl.getName()+"\n"+ctrl.getAddress());
		
		System.out.println("==============================");
		for (int i = 0; i <= 5; i++) {
			Crt_2 ctrl2= new Crt_2("김재훈"+i,"서울"+i);
			System.out.println(ctrl2.getName()+"\n"+ctrl2.getAddress());
		}
		System.out.println("==============================");
		
		
	}
}
