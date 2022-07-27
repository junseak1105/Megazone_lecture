package j20220727;

import java.util.Iterator;

public class Array_6 {
	public static void main(String[] args) {
		String strvalue[] = { "김재훈", "홍길동", "아무개" };

		for (int i = 0; i < strvalue.length; i++) {
			System.out.println(strvalue[i]);
		}

		System.out.println("=====================");

		String strvalue2[][] = { { "김", "이", "박" }, { "오", "강", "최" } };

		for (int i = 0; i < strvalue2.length; i++) {
			for (int j = 0; j < strvalue2.length; j++) {
				System.out.print("\t" + strvalue2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("=====================");

		String strvalue3[][] = { { "김", "이", "박" }, { "오", "강", "최" } };

		for (int i = 0; i < strvalue3.length; i++) {
			for (int j = 0; j < strvalue3.length; j++) {
				if (strvalue3[i][j].equals("김")) {
					System.out.println("" + strvalue3[i][j] + "씨 검색됨");
				}else if (strvalue3[i][j].equals("이")) {
					System.out.println("" + strvalue3[i][j] + "씨 검색됨");
				}
			}
		}
	}
}