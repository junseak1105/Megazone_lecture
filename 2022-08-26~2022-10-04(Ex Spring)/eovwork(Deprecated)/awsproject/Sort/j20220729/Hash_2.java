package Sort.j20220729;

import java.util.Hashtable;

public class Hash_2 {

	public static void main(String[] args) {

		Hashtable hash = new Hashtable();

		for (int i = 1; i < 6; i++) {
			hash.put(i, i);
		}

		for (int i = 1; i <= hash.size(); i++) {
			int intval = (int) hash.get(i);
			System.out.println(intval);
		}

		System.out.println("==================");
		hash.clear();
		int sum = 0;
		for (int i = 2; i <= 11; i++) {
			hash.put(i, i);
		}
		for (int i = 2; i < hash.size()+2; i++) {
			int intval = (int) hash.get(i);
			sum += intval;
		}
		System.out.println(sum);

	}
}
