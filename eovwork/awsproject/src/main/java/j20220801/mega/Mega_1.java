//package j20220801.mega;
//
//import java.util.Enumeration;
//import java.util.Hashtable;
//
//import common.CommonHome;
//
//public class Mega_1 extends CommonHome {
//	public Mega_1(String name, int age, String address) {
//		this.setName(name);
//		this.setAge(age);
//		this.setAddress(address);
//	}
//
//	public static void main(String[] args) throws Exception {
//		Gwang_1 gw1 = new Gwang_1("일", 20, "부산");
//		Gwang_2 gw2 = new Gwang_2("이", 20, "부산");
//		Gwang_3 gw3 = new Gwang_3("삼", 20, "부산");
//		Gwang_4 gw4 = new Gwang_4("사", 20, "부산");
//		Gwang_5 gw5 = new Gwang_5("오", 20, "부산");
//
//		String array[] = { "j20220801.mega.Gwang_1", "j20220801.mega.Gwang_2", "j20220801.mega.Gwang_3",
//				"j20220801.mega.Gwang_4", "j20220801.mega.Gwang_5" };
//
//		Hashtable hash = new Hashtable();
//		hash.put(gw1.getName(), gw1);
//		hash.put(gw2.getName(), gw2);
//		hash.put(gw3.getName(), gw3);
//		hash.put(gw4.getName(), gw4);
//		hash.put(gw5.getName(), gw5);
//
//		Enumeration en = hash.keys();
//		
//		
//		for (int i = 0; i < array.length; i++) {
//			while (en.hasMoreElements()) {
//				Object keys =en.nextElement();
//				try {
////					CommonHome home = (CommonHome) Class.forName(array[i]).newInstance();
//					CommonHome comhome = (CommonHome) hash.get(keys);
//					String classname = comhome.getClass().getName();
//					System.out.println(classname);
////					if(array[i].equals(classname)) {
//						System.out.print("\t"+comhome.getName());
//						System.out.print("\t"+comhome.getAge());
//						System.out.println("\t"+comhome.getAddress());
////					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//
//			}
//
//		}
//
//	}
//
//}
