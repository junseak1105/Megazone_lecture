package Sort.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Properties_API {

	// 프로퍼티 파일로 읽어오기
	public static void pro_file() throws FileNotFoundException, IOException {
		String path = "/path";
		String filename = "filename";

		File file = new File(path + filename);
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		Enumeration en = pro.keys();
		String str[] = new String[pro.size()];
		int i = 0;
		// Enumeration 에서 키값 or value 추출
		while (en.hasMoreElements()) {
			str[i] = (String) en.nextElement();
			i++;
		}
		System.out.println("이름:" + pro.getProperty("name")); // 키값을 통해 value 추출
	}

	// 프로퍼티 내부 데이터로 읽어오기
	public static void pro_inner() {
		Properties pro = new Properties();
		pro.setProperty("name", "김재훈");
		Enumeration en = pro.keys();
		String str[] = new String[pro.size()];
		int i = 0;

		System.out.println("이름:" + pro.getProperty("name")); // 키값을 통해 value 추출
		// Enumeration 에서 키값 or value 추출
		while (en.hasMoreElements()) {
			str[i] = (String) en.nextElement();
			i++;
		}
		for (int j = 0; j < str.length; j++) {
			System.out.println(pro.getProperty(str[j]));
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		pro_file();
		pro_inner();
	}
}
