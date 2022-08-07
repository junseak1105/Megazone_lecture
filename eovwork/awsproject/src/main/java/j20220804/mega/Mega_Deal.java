package j20220804.mega;

import java.util.ArrayList;

public class Mega_Deal extends MegaFactory{
	
	public static void main(String[] args) {
//		Gwang_1 gw1 = new Gwang_1();
//		gw1.setChoiceroom("1반");
//		System.out.println(gw1.getChoicroom());
		
		
		BaseMega basemega = new Gwang_1();
		BaseMega basemega2 = new Gwang_2();
		BaseMega basemega3 = new Gwang_3();
		BaseMega basemega4 = new Gwang_4();
		BaseMega basemega5 = new Gwang_5();
		
		basemega.setChoiceroom("1반");
		basemega2.setChoiceroom("2반");
		basemega3.setChoiceroom("3반");
		basemega4.setChoiceroom("4반");
		basemega5.setChoiceroom("5반");
		
		ArrayList list = new ArrayList();
		list.add(basemega);
		list.add(basemega2);
		list.add(basemega3);
		list.add(basemega4);
		list.add(basemega5);
		
		System.out.println("==========================");
		
		for (int i = 0; i < list.size(); i++) {
			BaseMega base = (BaseMega)list.get(i);
			System.out.println(base.getChoiceroom());
		}
		
		
		
	}
	
}
