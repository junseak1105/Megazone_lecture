//package questionpool;
//
//import java.util.Enumeration;
//import java.util.Hashtable;
//
//import common.CommonHome;
//
//public class HashHome extends CommonHome {
//	public static Hashtable hash = new Hashtable();
//	public HashHome(String name,int age, String address) {
//		this.setName(name);
//		this.setAge(age);
//		this.setAddress(address);
//	}
//
//	public static void main(String[] args) {
//		for (int i = 1; i <= 3; i++) {
//			HashHome hh = new HashHome("김재훈"+i,25+i,"우동"+i);
//			hash.put(hh.getName(), hh);
//		}
//		
//		Enumeration en = hash.keys();
//
//		while (en.hasMoreElements()) {
//			String temp = (String) en.nextElement();
//			HashHome H_h = (HashHome) hash.get(temp);
//			System.out.println("이름:" + H_h.getName() + " 나이:" + H_h.getAge() + " 주소:" + H_h.getAddress());
//		}
//
//	}
//}
