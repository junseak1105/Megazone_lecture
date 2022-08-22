package Sort.j20220729;

import java.util.Hashtable;

public class Hash_5 {

	
	public static void main(String[] args) {
		Hashtable hash = new Hashtable();
		hash.put(1, "김재훈");
		hash.put(2, 30);
		hash.put(3, "부산");
		
		
		for (int i = 1; i <= hash.size(); i++) {
			String name =hash.get(i).getClass().getName();
			String value = "";
			int intvalue = 0;
			if(name.equals("java.lang.String")) {
				value = (String)hash.get(i);
				System.out.println("string:"+value);
			}
			if(name.equals("java.lang.Integer")){
				intvalue = (int)hash.get(i);
				System.out.println(("int:"+intvalue));
			}
		}
	}
}
