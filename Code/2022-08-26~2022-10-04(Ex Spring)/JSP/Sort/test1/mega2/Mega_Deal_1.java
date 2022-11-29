package Sort.test1.mega2;

import java.util.ArrayList;

public class Mega_Deal_1 {

	public static void main(String[] args) throws Exception {
//		Gwang_1 gw1 = new Gwang_1();
//		gw1.Room();
//		Gwang_2 gw2 = new Gwang_2();
//		gw2.Room();
//		Gwang_3 gw3 = new Gwang_3();
//		gw3.Room();
//		Gwang_4 gw4 = new Gwang_4();
//		gw4.Room();
//		Gwang_5 gw5 = new Gwang_5();
//		gw5.Room();
		
		//5:50분까지 1~5반 자동 출력
		
//		Mega2 me1 = new Gwang_1();
//		Mega2 me2 = new Gwang_2();
//		Mega2 me3 = new Gwang_3();
//		Mega2 me4 = new Gwang_4();
//		Mega2 me5 = new Gwang_5();
		
		ArrayList list = new ArrayList();
		
		String arr[] = {"j20220801.mega2.Gwang_1","j20220801.mega2.Gwang_2","j20220801.mega2.Gwang_3","j20220801.mega2.Gwang_4","j20220801.mega2.Gwang_5"};
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		for (int i = 0; i < list.size(); i++) {
			String objectvalue = (String)list.get(i);
			Mega2 me = (Mega2) Class.forName(objectvalue).newInstance();
			me.ChoiceRoom();
//			Mega2 mecommon = (Mega2)list.get(i);
//			mecommon.ChoiceRoom();
			
		}
		
//		for (int i = 0; i < 5; i++) {
//			Mega2 me = (Mega2) Class.forName(arr[i]).newInstance();
//			me.ChoiceRoom();
//		}
		
		
		/*
		 * 
		 * Mega interface method:public void droom(); 
		 * Mega extends Gwang_1 
		 * Mega extends Gwang_2 
		 * class:Gwang_1() 
		 * method:public void droom() 
		 * class:Gwang_2() 
		 * method:public void droom() 
		 * Mega mega=new Gwang_1(); 
		 * Mega mega2=new Gwang_2(); 
		 * for 문을 이용해서 메소드 room() 을출력하는 코드를 작성하시오
		 */
	}
}
