package Sort.j20220804;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PrintWriter_1 {

	public static void main(String[] args) throws IOException {
		String path = "/project/share/questionfile";
		String filename = "/common.properties";

		File file = new File(path + filename);

		boolean choice = false;
		System.out.println(file.createNewFile());
		
		if (file.createNewFile()) { //없으면
			choice = true;
		} else {//있으면
			choice = false;
		}

		if (choice) {
			PrintWriter write = new PrintWriter(file);
			write.write("name = 김재훈\n");
			write.write("age = 20\n");
			write.write("address = 부산\n");
			write.flush();

		}
		
		Properties pro = new Properties();
		
//		pro.load(file));
//		Enumeration en = pro.elements();
//		
//		while(en.hasMoreElements()) {
//			
//		}
		//혼자
//		FileWriter filew = new FileWriter(path+filename);
//		Properties p = new Properties();
//		p.setProperty("name", "testid");
//		p.store(filew, "아이디");

	}
}
