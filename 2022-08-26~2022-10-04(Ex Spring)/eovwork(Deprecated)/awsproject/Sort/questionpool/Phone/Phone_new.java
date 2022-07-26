package Sort.questionpool.Phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public abstract class Phone_new implements SKT_function {

	public static ArrayList client_list = new ArrayList();
	BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	public static String path = "C:\\project\\share\\skt\\client.txt";

	

	@Override
	public void Choose_place() {
		int num = -1;
		while(num!=0) {
			System.out.println("0.종료 1.온라인 가입 2.오프라인 가입");
			try {
				num = Integer.parseInt(buffer.readLine());
				if (num == 1) {
					Create_New_Online();
				}
				if (num == 2) {
					Create_New_Offline();
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

	@Override
	public void Create_New_Online() {
		System.out.println("온라인 개통을 진행합니다.");
		System.out.println("통신사/이름/주민번호1/주민번호2/이메일/나이/주소 형태로 입력해주세요.");
		String form = null;
		try {
			form = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		client_list.add(Tokenize(form+"/온라인"));
	}

	@Override
	public void Create_New_Offline() {
		System.out.println("온라인 개통을 진행합니다.");
		System.out.println("통신사/이름/주민번호1/주민번호2/이메일/나이/주소 형태로 입력해주세요.");
		String form = null;
		try {
			form = buffer.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		client_list.add(Tokenize(form+"/오프라인"));
	}

	@Override
	public void EditFile() {

		String str = "";
		try {
			BufferedReader buffer1 = new BufferedReader(new FileReader(path));
			String inputname = "";
			while ((inputname = buffer1.readLine()) != null) {
				str = str + inputname + "\n";
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			bw.write(str);// 원래있던내용 추가 후 입력받기

			for (int i = 0; i < client_list.size(); i++) {
				SKT_Form temp = (SKT_Form) client_list.get(i);
				bw.write(temp.phonecompanyname + "/" + temp.name + "/" + temp.jumin1 + "/" + temp.jumin2 + "/"
						+ temp.email + "/" + temp.age + "/" + temp.address + "/" + temp.where + "\n");
			}
			bw.close();// 혹은 bw.flush() 를 해야 완료
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void ShowList() {

		String inputname = "";
		client_list.clear();
		try {
			BufferedReader buffer1 = new BufferedReader(new FileReader(path));
			while ((inputname = buffer1.readLine()) != null) {
				client_list.add(Tokenize(inputname));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < client_list.size(); i++) {
			SKT_Form temp = (SKT_Form) client_list.get(i);
			System.out.println("통신사:" + temp.phonecompanyname + "\t이름:" + temp.name + "\t주민번호:" + temp.jumin1 + "-"
					+ temp.jumin2 + "\t이메일:" + temp.email + "\t나이:" + temp.age + "\t주소:" + temp.address + "\t가입위치:"
					+ temp.where);
		}

	}
	
	@Override
	public SKT_Form Tokenize(String form) {
		StringTokenizer token = new StringTokenizer(form, "/");
		String cpname = token.nextToken();
		String name = token.nextToken();
		String jumin1 = token.nextToken();
		String jumin2 = token.nextToken();
		String email = token.nextToken();
		int age = Integer.parseInt(token.nextToken());
		String address = token.nextToken();
		String where = token.nextToken();
		
		SKT_Form skt_Form = new SKT_Form(cpname, name, jumin1, jumin2, email, age, address, where);
		
		return skt_Form;

	}
	
}
