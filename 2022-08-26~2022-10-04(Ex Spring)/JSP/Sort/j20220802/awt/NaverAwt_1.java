package Sort.j20220802.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class NaverAwt_1 extends Frame {
	
	public static TextField Id = new TextField(15);
	public static TextField passwd = new TextField(15);
	
	
	public static TextField getId() {
		return Id;
	}

	public static void setId(TextField Id) {
		NaverAwt_1.Id = Id;
	}

	public static TextField getPasswd() {
		return passwd;
	}

	public static void setPasswd(TextField passwd) {
		NaverAwt_1.passwd = passwd;
	}

	public NaverAwt_1() {
		setSize(300, 300);
		setVisible(true);
		setLayout(new GridLayout(3, 2));
		addWindowListener(new CommonAwtEvent());

		Button btn = new Button("Login");
		btn.addActionListener(new CommonAwtEvent());
		add(new Label("ID"));
		add(Id);
		add(new Label("PW"));
		add(passwd);
		add(new Label(""));
		add(btn);

	}

	public static void main(String[] args) {
		NaverAwt_1 text = new NaverAwt_1();
	}

}
