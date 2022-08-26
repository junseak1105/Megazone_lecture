package Sort.common;

import java.util.ArrayList;

public class Method_2 extends CommonHome{
	
	public Method_2(String name, int age, String address) {
		super(name,age,address);
	}
	
	public static void main(String[] args) {

		Method_2 me = new Method_2("김재훈", 26, "부산");
		System.out.println(me.getName());
		System.out.println(me.getAge());
		System.out.println(me.getAddress());
		
		ArrayList list = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			Method_2 me3 = new Method_2("김재훈"+i, 26+i, "부산");
			list.add(me3);
		}
		
		for (int i = 0; i < list.size(); i++) {
			Method_2 temp = (Method_2)list.get(i);
		}
		
	}
	
	
}
