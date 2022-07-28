package j20220728;

import java.util.*;

public class Token_2 {

	public static void main(String[] args) {

		String home = "김재훈/20/한국";

		StringTokenizer token = new StringTokenizer(home, "/");

		while (token.hasMoreElements()) {
			String temp = (String)token.nextElement();
			
			if (temp.equals("김재훈")) {
				System.out.println("이름:" + temp);
			} else if (temp.equals("20")) {
				System.out.println("나이:" + temp);
			} else if (temp.equals("한국")) {
				System.out.println("국적:" + temp);
			}
		}
	}
}