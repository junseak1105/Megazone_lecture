package Sort.j20220801;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_7 {

	public static void main(String[] args) {
		Hashtable hash = new Hashtable();
		hash.put("일재훈", "일재훈");
		hash.put("이재훈", "이재훈");
		hash.put("삼재훈", "삼재훈");

		Enumeration en = hash.keys();
		while (en.hasMoreElements()) {
			String keyvalues = (String) en.nextElement();
			String values = (String) hash.get(keyvalues);
			System.out.println("key:" + keyvalues + "\t value:" + values);
		}
	}

}
