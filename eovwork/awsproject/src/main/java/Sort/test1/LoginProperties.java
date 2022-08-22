package Sort.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class LoginProperties {
	/*
	 * PrintWriter Properties key,value 사용 userid passwd email 입력받기
	 * 
	 * if(userid.equals("kim1234") if(passwd.equals("1234")
	 * if(email.equals("kim1234@naver.com)
	 */
	// 프로퍼티 파일로 읽어오기

	public void Login_Chk(String userid, String passwd, String email) throws Exception {
		String path = "/project/";
		String filename = "test.txt";

		File file = new File(path + filename);
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		if (pro.get("userid").equals(userid)) {
			if (pro.get("passwd").equals(passwd)) {
				if (pro.get("email").equals(email)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("이메일 불일치");
				}
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else {
			System.out.println("아이디 불일치");
		}
	}

	public LoginProperties() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("id:");
		String userid = buffer.readLine();
		System.out.println("pw:");
		String passwd = buffer.readLine();
		System.out.println("email:");
		String email = buffer.readLine();
		
		this.Login_Chk(userid, passwd, email);
	}

	public static void main(String[] args) throws Exception{
		LoginProperties lg = new LoginProperties();
		

		
	}
}
