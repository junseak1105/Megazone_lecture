package Sort.j20220728;

import java.util.*;

public class Token_1 {
	
	public static void main(String[] args) {
		
		//token(식별자): 구분할 수 있는 기호
		//토큰 기본 식별자는 공백
		
		String home = "김재훈 26 부산";
		StringTokenizer token = new StringTokenizer(home);
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		
		System.out.println("=====================");
		
		String arr[] = {"아니 이게 맞나","이게 맞나 아니","맞나 이게 아니"};
		
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer token1 = new StringTokenizer(arr[i]);
			while(token1.hasMoreElements()) {
				System.out.print(token1.nextToken()+'.');
			}
			System.out.println("");
		}
		
		System.out.println("=====================");
		
		String strvalue[] = new String[token.countTokens()];
		for (int i = 0; token.hasMoreElements(); i++) {
			strvalue[i]=token.nextToken();
			System.out.println(strvalue[i]);
			
		}
		
	}
}
