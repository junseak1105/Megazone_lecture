package j20220729;

import java.util.ArrayList;

public class List_4 {
	
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		
		list.add(1);
		int value = (int)list.get(0);
		
		System.out.println(value);
		System.out.println("==================");
		
		list.add("김재훈");
		String.valueOf(list.get(1));
	}
}
