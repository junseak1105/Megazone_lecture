package Sort.j20220729;

import java.util.Hashtable;

public class Hash_3 {

	String address;
	String name;
	int age;
	String pcode1;
	String pcode2;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hash_3(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Hash_3(String name, int age, String address, String pcode1, String pcode2) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.pcode1 = pcode1;
		this.pcode2 = pcode2;
	}
	public static void main(String[] args) {

		/*
		 * key value key object -> 모든 타입이 올 수 있다 class 부모 object -> 모든 타입을 object가 받을 수
		 * 있따 최상위 부모 받을 수 있다
		 * 
		 * key 모든 타입이 올 수 있다
		 */

		Hashtable hash = new Hashtable();

		hash.put("김재훈", "김재훈v");
		hash.put(1, 1);

		String strvalue = String.valueOf(hash.get("김현호"));

		int value = (int) hash.get(1);
//		System.out.println(strvalue);
//		System.out.println(value);
		
		hash.clear();
		//무명 클래스
		hash.put(1, new Hash_3("김재훈","부산"));
		
		Hash_3 hashvalue = (Hash_3)hash.get(1);
		
		System.out.println(hashvalue.name);
		System.out.println(hashvalue.address);
		
		System.out.println("=============================");
		hash.clear();
		
		for (int i = 1; i <= 3; i++) {
			hash.put(i, new Hash_3(i+"재훈", 20+i, "우동"+i, "971105", "121212"));
		}
		for (int i = 1; i <= 3; i++) {
			Hash_3 hashval = (Hash_3)hash.get(i);
			System.out.println("\t이름:"+hashval.name+"\t나이:"+hashval.age+"\t주소:"+hashval.address+"\t주민번호:"+hashval.pcode1+"-"+hashval.pcode2);
		}
		
		
	}
}
