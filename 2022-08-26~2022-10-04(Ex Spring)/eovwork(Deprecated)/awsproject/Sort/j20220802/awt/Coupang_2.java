package Sort.j20220802.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Coupang_2 extends Frame implements ActionListener {
	public ArrayList id_list = new ArrayList(); 
	public TextField userid = new TextField();
	public TextField userpw = new TextField();
	public TextField userpw_chk = new TextField();
	public TextField username = new TextField();
	public TextField phone = new TextField();
	public Label l_regi = new Label("");

	@Override
	public void actionPerformed(ActionEvent e) {
		String str= e.getActionCommand();
		if(str.equals("Register")) {
			Check_duplicate();
		}
		
	}
	public void Check_duplicate() {
		boolean bool = false;
		//아이디 중복 검증
		for (int i = 0; i < id_list.size(); i++) {
			if(userid.getText().equals(id_list.get(i))) {
				bool = true;
			}else {
				bool = false;
			}
		}
		if(bool) {
			l_regi.setText("ID already exists");
		}else {
			if(!userpw.getText().equals(userpw_chk.getText())) {
				l_regi.setText("password doesn't match original");
			}else {
				if(username.getText().equals("")) {
					l_regi.setText("Invalid name");
				}else{
					if(phone.getText().equals("")) {
						l_regi.setText("Invalid phone number");
					}else {
						l_regi.setText("Register Success!");
						System.out.println("ID:"+userid.getText()+"\tPW:"+userpw.getText()+"\t이름:"+username.getText()+"\t전화번호:"+phone.getText());
					}
				}
			}
		}
	}
	public Coupang_2() {
		setLayout(new GridLayout(6, 2));
		id_list.add("testid");
		Label l_userid = new Label("email");
		Label l_userpw = new Label("password");
		Label l_userpw_chk = new Label("password chk");
		Label l_username = new Label("name");
		Label l_phone = new Label("phone");
		
		Button btn = new Button("Register");
		btn.addActionListener(this);
		
		add(l_userid);
		add(userid);
		add(l_userpw);
		add(userpw);
		add(l_userpw_chk);
		add(userpw_chk);
		add(l_username);
		add(username);
		add(l_phone);
		add(phone);
		add(l_regi);
		add(btn);
		
		
		
		addWindowListener(new WindowEvent());
		setSize(300, 200);
		setVisible(true);
	}

	public class WindowEvent extends commonWindowEvent {
		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			super.windowClosing(e);
		}
	}

	public static void main(String[] args) {
		Coupang_2 cou = new Coupang_2();
	}
}
