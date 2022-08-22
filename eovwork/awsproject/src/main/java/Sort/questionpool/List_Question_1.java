package Sort.questionpool;

import java.util.ArrayList;

public class List_Question_1 {
	
	String name;
	int age;
	String address;
	String email;
	String personal1;
	String personal2;
	
	public List_Question_1(String name, int age, String address, String email, String personal1, String personal2) {
		this.name=name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.personal1 = personal1;
		this.personal2 = personal2;
	}
	
	public static void main(String[] args) {
		
		ArrayList array = new ArrayList();
		for (int i = 1; i < 4; i++) {
			List_Question_1 lq = new List_Question_1("김재훈"+i, i+20, "우동"+i, "test"+i+"@naver.com", "971105", "121212");
			array.add(lq);
		}
		for (int i = 0; i < array.size(); i++) {
			List_Question_1 lq = (List_Question_1)array.get(i);
			System.out.println("\t이름:"+lq.name+"\t나이:"+lq.age+"\t주소:"+lq.address+"\t이메일:"+lq.email+"\t주민번호:"+lq.personal1+"-"+lq.personal2);
		}
		
		
	}
}
