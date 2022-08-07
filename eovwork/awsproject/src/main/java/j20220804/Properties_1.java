package j20220804;

import java.util.Properties;

public class Properties_1 {

		
	public static void main(String[] args) {
		
		// \:\=
		Properties pro = new Properties();
		pro.put(1, 1);
		pro.put(2, 2);
		pro.put(3, 3);
		pro.put(4, 4);
		pro.put(5, 5);
		
		for (int i = 1; i <= pro.size(); i++) {
			int value = (int)pro.get(i);
			System.out.println(value);
		}	
		
	}
}
