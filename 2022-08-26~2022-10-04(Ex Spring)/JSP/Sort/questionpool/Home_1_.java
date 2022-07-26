package Sort.questionpool;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

public class Home_1_ {
	String name;
	int age;
	String address;
	String pcode1;
	String pcode2;
	
	public Home_1_(String name,int age,String address,String pcode1,String pcode2) {
		this.name = name;
		this.age =age;
		this.address =address;
		this.pcode1 = pcode1;
		this.pcode2 = pcode2;
	}
	
	public static void main(String[] args) throws IOException {
		
		String path = "/project/share/questionfile";
		String filename = "/home.properties";

		File file = new File(path + filename);

		boolean choice = false;
		
		if (!file.createNewFile()) {
			file.delete();
		}
		
		PrintWriter write = new PrintWriter(file);
		write.write("name = Kim\n");
		write.write("age = 20\n");
		write.write("address = Busan\n");
		write.write("email = test@email.com\n");
		write.write("pcode1 = 12345\n");
		write.write("pcode2 = 54321\n");
		write.flush();
		
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		Enumeration en = pro.keys();
		
		String str[] = new String[6];
		int i = 0;
		
		//이러면 순서가 섞임
		while(en.hasMoreElements()) {
			str[i]=(String)en.nextElement();
			i++;
		}
		
		System.out.println("이거 정렬 어떻게 합니까 선생님?");
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]+":"+pro.getProperty(str[j]));
		}
		
		System.out.println("-------------------------------------");
		
		System.out.println("이름:"+pro.getProperty("name"));
		System.out.println("나이:"+pro.getProperty("age"));
		System.out.println("주소:"+pro.getProperty("address"));
		System.out.println("이메일:"+pro.getProperty("email"));
		System.out.println("주민번호:"+pro.getProperty("pcode1")+"-"+(pro.getProperty("pcode2")));
		
	}
}
