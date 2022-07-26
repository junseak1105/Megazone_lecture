package Sort.j20220729;

import java.util.ArrayList;

public class List_1 {

	public static void main(String[] args) {

		String array2[] = {"이름1","이름2","이름3"};
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		// <E>: element를 받을 준비가 됐다.
		// ArrayList array = new ArrayList<E>();
		/*
		 * list: index 0 add: 0부터 시작, 0부터 값 저장
		 * 
		 */
		ArrayList array = new ArrayList();
		
		array.add(0, 1);
		array.add(1, 2);
		array.add(2, 3);
		array.add(3, 4);
		array.add(4, 5);
		System.out.println("====================");
		for (int i = 0; i < array.size(); i++) {
			int value = (int)array.get(i);
			System.out.println(value);
		}
		
		System.out.println("====================");
		array.clear();
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			array.add(i);
		}
		for (int i = 0; i < array.size(); i++) {
			int value = (int)array.get(i);
			sum += value;
		}
		System.out.println("합:"+sum);
	}
}
