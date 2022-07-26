package Sort.questionpool;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class InputLogin_1 extends Frame implements ActionListener {
	public static String path = "/project/share/questionfile/home";
	public static String filename = "/jay.properties";
	public static File file = new File(path+filename);
	
	
	// 회원가입 필드
	public static TextField r_id = new TextField();
	public static TextField r_name = new TextField();
	public static TextField r_pw1 = new TextField();
	public static TextField r_pw2 = new TextField();
	public static TextField r_email = new TextField();
	public static TextField r_address1 = new TextField();
	public static TextField r_address2 = new TextField();
	public static TextField r_phone = new TextField();
	
	

	// 로그인 필드
	public static TextField l_id = new TextField();
	public static TextField l_pw = new TextField();
	
	//결과 라벨
	public static Label result = new Label("");

	@Override
	public void actionPerformed(ActionEvent e) {
		String strvalue = e.getActionCommand();
		if (strvalue.equals("Register")) {
			try {
				Regi_chk();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (strvalue.equals("Login")) {
			try {
				Login_chk();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
	
	public void Regi_chk() throws FileNotFoundException {
		if(r_id.getText().isEmpty()) {
			result.setText("input ID");
			if(r_name.getText().isEmpty()) {
				result.setText("input name");
				if(r_pw1.getText().isEmpty()) {
					result.setText("input pw");
					if(r_pw2.getText().isEmpty()) {
						result.setText("input pw");
						if(!r_pw1.getText().equals(r_pw2.getText())) {
							result.setText("PW no match");
							if(r_email.getText().isEmpty()) {
								result.setText("input Email");
								if(r_address1.getText().isEmpty()) {
									result.setText("input address1");
									if(r_address2.getText().isEmpty()) {
										result.setText("input address2");
										if(r_phone.getText().isEmpty()) {
											result.setText("input phone");
										}
									}
								}
							}
						}
					}
				}
			}
		}else {
			Register();
		}
	}
	
	public void Register() throws FileNotFoundException {
		PrintWriter write = new PrintWriter(file);
		write.write("id ="+r_id.getText()+"\n");
		write.write("name ="+r_name.getText()+"\n");
		write.write("pw ="+r_pw1.getText()+"\n");
		write.write("email ="+r_email.getText()+"\n");
		write.write("address1 ="+r_address1.getText()+"\n");
		write.write("address2 ="+r_address2.getText()+"\n");
		write.write("phone ="+r_phone.getText()+"\n");
		write.flush();
		result.setText("registered");
		
	}

	public void Login_chk() throws FileNotFoundException, IOException{
		if(l_id.getText().isEmpty()) {
			result.setText("Input ID");
			if(l_pw.getText().isEmpty()) {
				result.setText("Input PW");
			}
		}else {
			Login();
		}
	}
	
	public void Login() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream(file));
		if((pro.getProperty("id").equals(l_id.getText())) && (pro.getProperty("pw").equals(l_pw.getText()))) {
			result.setText("Login Success");
		}
	}
	
	public InputLogin_1() {
		setSize(1000, 1000);
		setVisible(true);
		setLayout(new GridLayout(15, 2));
		addWindowListener(new commonWindow());

		Button btn_regi = new Button("Register");
		Button btn_login = new Button("Login");
		
		btn_regi.addActionListener(this);
		btn_login.addActionListener(this);
		
		//회원가입
		add(new Label());
		add(new Label("Register"));
		
		add(new Label("ID"));
		add(r_id);
		add(new Label("Name"));
		add(r_name);
		add(new Label("PW"));
		add(r_pw1);
		add(new Label("PW_chk"));
		add(r_pw2);
		add(new Label("Email"));
		add(r_email);
		add(new Label("Address1"));
		add(r_address1);
		add(new Label("Address2"));
		add(r_address2);
		add(new Label("Phone"));
		add(r_phone);
		add(new Label());
		add(btn_regi);
		
		add(new Label());
		add(new Label("Login"));
		
		add(new Label("ID"));
		add(l_id);
		add(new Label("PW"));
		add(l_pw);
		add(new Label());
		add(btn_login);
		
		add(new Label("Result:"));
		add(result);

	}

	public void File_exist_chk() throws IOException {
		boolean choice = false;
		if (file.createNewFile()) { // 없으면
			choice = true;
		} else {// 있으면
			choice = false;
		}

	}

	public static void main(String[] args) throws IOException {
		InputLogin_1 in = new InputLogin_1();
		in.File_exist_chk();

	}

}
