package Sort.j20220802.awt;

import java.util.ArrayList;

public class Awt_6 {
	
	ArrayList list = new ArrayList();

	public void ListAdd(String name) {
		list.add(name);
	}

	public ArrayList getList() {
		return list;
	}
	

	
	public Awt_6() {

	}

	public static void main(String[] args) {
		Awt_6 awt = new Awt_6();
		awt.ListAdd("일");
		awt.ListAdd("이");
		awt.ListAdd("삼");
		
		ArrayList list = awt.getList();
		for (int i = 0; i < list.size(); i++) {
			String strvalue = (String)list.get(i);
			System.out.println(strvalue);
		}
		
	}
}
