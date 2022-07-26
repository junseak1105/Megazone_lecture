package Sort.j20220804.mega;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Mega_Deal2 extends MegaFactory{

	public static void main(String[] args) throws IOException {
		
		Hashtable hash = new Hashtable();
		hash.put(1, (BaseMega)new Gwang_1());
		hash.put(2, (BaseMega)new Gwang_2());
		hash.put(3, (BaseMega)new Gwang_3());
		hash.put(4, (BaseMega)new Gwang_4());
		hash.put(5, (BaseMega)new Gwang_5());
		
		for (int i = 0; i < hash.size(); i++) {
			BaseMega temp = (BaseMega)hash.get(i+1);
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("이름 입력:");
			String name = buffer.readLine();
			System.out.println("나이 입력:");
			int age = Integer.parseInt(buffer.readLine());
			System.out.println("주소 입력:");
			String address = buffer.readLine();
			temp.setInfo(name,age,address);
		}
		
		for (int i = 0; i < hash.size(); i++) {
			BaseMega temp = (BaseMega)hash.get(i+1);
			System.out.println("이름:"+temp.getName());
			System.out.println("나이:"+temp.getAge());
			System.out.println("주소:"+temp.getAddress());
			System.out.println("-------------");
		}
		
		
		
	}
}
