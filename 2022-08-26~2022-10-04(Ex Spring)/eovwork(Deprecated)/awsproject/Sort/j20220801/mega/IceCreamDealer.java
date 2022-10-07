package Sort.j20220801.mega;

import java.util.Hashtable;

public class IceCreamDealer {
	public static void main(String[] args){
//		IceCream_Gugu gu = new IceCream_Gugu();
//		gu.IceCreamExecute();
//		
//		IceCream_World world = new IceCream_World();
//		world.IceCreamExecute();
		
		IceCream ice1 = new IceCream_Gugu();
		IceCream ice2 = new IceCream_World();
		IceCream ice3 = new IceCream_BibiBig();
		
		Hashtable table = new Hashtable();
		table.put(1, ice1);
		table.put(2, ice2);
		table.put(3, ice3);	
		
		for (int i = 0; i < table.size(); i++) {
			IceCream icecommon = (IceCream)table.get(i);
			icecommon.IceCreamExecute();
		}
	}
}
