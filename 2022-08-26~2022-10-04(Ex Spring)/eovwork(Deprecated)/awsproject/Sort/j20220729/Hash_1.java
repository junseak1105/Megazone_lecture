package Sort.j20220729;

import java.util.Hashtable;

public class Hash_1 {

	public static void main(String[] args) {
		/*
		 * full index: 0~max hash: key, value -> 1:1 속도가 가장 빠르다 key를 찾으면 value를 찾는다
		 * <K,V>:key,value Hashtable hash = new Hashtable<K, V>();
		 */

		Hashtable hash = new Hashtable();
		hash.put(0, 0);
		hash.put(1, 1);
		hash.put(2, 2);
		hash.put(3, 3);
		hash.put(4, 4);

		for (int i = 0; i < hash.size(); i++) {
			int intvalue = (int) hash.get(i);
			System.out.println(intvalue);
		}

		hash.clear();
		hash.put("김재훈1", "김재훈1v");
		hash.put("김재훈2", "김재훈2v");
		hash.put("김재훈3", "김재훈3v");

		for (int i = 1; i <= hash.size(); i++) {
			String strvalue = (String) hash.get("김재훈" + i);
			System.out.println(strvalue);
		}
		String name2 = String.valueOf(hash.get("김재훈1"));
		System.out.println(name2);

	}
}
