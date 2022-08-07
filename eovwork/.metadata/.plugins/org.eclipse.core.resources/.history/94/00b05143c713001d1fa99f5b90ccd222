package j20220801;

import java.util.Hashtable;
import common.CommonHome;


public class Hash_2 extends CommonHome{
	public Hash_2() {
		// TODO Auto-generated constructor stub
	}
	public Hash_2(String name, int age, String address) {
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
	}

	public static void main(String[] args) {
		
		Hashtable hash = new Hashtable();
		
		for (int i = 0; i < 11; i++) {
			hash.put(i, i);
			
			System.out.println((int)hash.get(i));
		}
		System.out.println("===================");
		hash.clear();
		
		Hash_2 hash2 = new Hash_2();
		hash2.setName("김재훈");
		hash2.setAge(26);
		hash2.setAddress("부산");
		
		System.out.println(hash2.getName());
		System.out.println(hash2.getAge());
		System.out.println(hash2.getAddress());
		
		System.out.println("===================");
		
		Hash_2 hash3 = new Hash_2("김재훈",26,"해운대");
		System.out.println(hash3.getName());
		System.out.println(hash3.getAge());
		System.out.println(hash3.getAddress());
	}
}
