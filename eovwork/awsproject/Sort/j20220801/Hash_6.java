package Sort.j20220801;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_6 {

	public static void main(String[] args) {
		Hashtable hash = new Hashtable();
		
		hash.put("일재훈","일재훈");
		hash.put("이재훈","이재훈");
		hash.put("삼재훈","삼재훈");
		
		
		Enumeration em = hash.keys();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
	
}
