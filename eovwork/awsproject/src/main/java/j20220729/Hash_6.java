package j20220729;

import java.util.Hashtable;

public class Hash_6 {
	String name;
	String address;
	
	
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Hash_6(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public static void main(String[] args) {
		Hash_6 hash = new Hash_6("김재훈","부산");
		Hashtable table = new Hashtable();
		
		table.put(1, hash);
		
		Hash_6 hashvalue =(Hash_6)table.get(1);
		System.out.println(hashvalue.getName());
		System.out.println(hashvalue.getAddress());
		
	}
}	
