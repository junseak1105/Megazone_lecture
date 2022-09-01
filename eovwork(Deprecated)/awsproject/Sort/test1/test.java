package Sort.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;

public class test {
	/*
	 * BufferedReader 을 이용해서 이름,나이,이메일 ,파일경로명 : 예)c:\one\two\three 입력받기 printWriter
	 * 로 키 =값 쓰기 이름,나이,이메일 Properties pro=new Properties() 키를 읽어서 이름
	 * if(입력.equals(pro.key) 나이 if(입력.equals(pro.key) 이메일 if(입력.equals(pro.key)
	 */
	private static String path = "";
	private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	private static boolean Move_dir() {
		File file = new File(path);
		if (file.isDirectory()) {
			System.out.println("경로를 설정하였습니다.");
			return false;
		} else {
			System.out.println("존재하지않는 경로입니다.");
			path = "";
			return true;
		}
	}

	private static void Write_File() throws Exception {

		File file = new File(path + "/properties.txt");

		System.out.println("name");
		String name = buffer.readLine();
		System.out.println("age:");
		String age = buffer.readLine();
		System.out.println("email:");
		String email = buffer.readLine();

		PrintWriter write = new PrintWriter(file);
		write.write("name=" + name+"\n");
		write.write("age=" + age+"\n");
		write.write("email=" + email+"\n");
		write.flush();
		System.out.println("작성완료");

	}

	public static void Login_Chk(String name, String age, String email) throws Exception {
		String filename = "properties.txt";
		File file = new File(path +"/"+ filename);
		file.createNewFile();
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		if (name.equals(pro.get("name"))) {
			if (age.equals(pro.get("age"))) {
				if (email.equals(pro.get("email"))) {
					System.out.println("인증 성공");
				} else {
					System.out.println("이메일 불일치");
				}
			} else {
				System.out.println("나이 불일치");
			}
		} else {
			System.out.println("이름 불일치");
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("파일 경로 입력");
		path = buffer.readLine();
		while (Move_dir()) {
			System.out.println("파일 경로 입력");
			path = buffer.readLine();
		}
		Write_File();

		System.out.println("name");
		String name = buffer.readLine();
		System.out.println("age:");
		String age = buffer.readLine();
		System.out.println("email:");
		String email = buffer.readLine();

		Login_Chk(name, age, email);

	}

}
