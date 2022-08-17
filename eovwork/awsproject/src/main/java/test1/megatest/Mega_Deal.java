package test1.megatest;

import java.util.ArrayList;

public class Mega_Deal {

	public static void main(String[] args) throws Exception {

		
		ArrayList list = new ArrayList();
		
		String arr[] = {"test1.megatest.Gwang_1","test1.megatest.Gwang_2"};
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		for (int i = 0; i < list.size(); i++) {
			String objectvalue = (String)list.get(i);
			Mega me = (Mega) Class.forName(objectvalue).newInstance();
			me.droom();;
			
		}
		
	}
}
