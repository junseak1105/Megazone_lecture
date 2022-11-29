package Sort.j20220801;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class Hash_5 {
	
	
	public static void main(String[] args) {
		
		Hashtable hash = new Hashtable();
		
		hash.put(1, 1);
		hash.put(2, 2);
		hash.put(3, 3);
		
		for (int i = 1; i <= hash.size(); i++) {
			int num = (int)hash.get(i);
			System.out.println(num);
		}
		
		System.out.println("====================");
		hash.clear();
		
		hash.put("김재훈", "김재훈");
		hash.put("김재훈1", "김재훈1");
		
		Collection coll = hash.values();
		Iterator it = coll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
