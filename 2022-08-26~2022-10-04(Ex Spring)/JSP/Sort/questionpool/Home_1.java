//package questionpool;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Hashtable;
//import java.util.StringTokenizer;
//
//import common.CommonHome;
//
//public class Home_1 extends CommonHome {
//	public static Hashtable hash = new Hashtable();
//	
//	
//	public Home_1() {
//		// TODO Auto-generated constructor stub
//	}
//	public Home_1(String name, int age, String address) {
//		this.setName(name);
//		this.setAge(age);
//		this.setAddress(address);
//	}
//	
//	public String Input() throws IOException {
//		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
//		String str = buffer.readLine();
//		return str;
//	}
//	public Home_1 Tokenize(String str) {
//		StringTokenizer token = new StringTokenizer(str,"/");
//		String name = token.nextToken();
//		int age = Integer.parseInt(token.nextToken());
//		String address = token.nextToken();
//		Home_1 hm = new Home_1(name,age,address);
//		return hm;
//		
//	}
//	
//	public static void main(String[] args) throws IOException {
//		
//		Home_1 hm = new Home_1();
//		System.out.println("몇명입력?");
//		int num = Integer.parseInt(hm.Input());
//		for (int i = 0; i < num; i++) {
//			System.out.println("이름/나이/주소 형식으로 입력");
//			String str = hm.Input();
//			Home_1 hm1 = hm.Tokenize(str);
//			hash.put(i, hm1);	
//		}
//		for(int i = 0;i<hash.size();i++) {
//			Home_1 temp = (Home_1)hash.get(i);
//			System.out.println("이름:"+temp.getName()+"나이:"+temp.getAge()+"주소:"+temp.getAddress());
//		}
//		
//	}
//}
