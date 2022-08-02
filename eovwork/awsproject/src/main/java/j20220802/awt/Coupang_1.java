package j20220802.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Coupang_1 extends Frame implements WindowListener,ActionListener{
	public TextField logintext =new TextField(15);
	public TextField passwdtext =new TextField(15);
	@Override
	public void actionPerformed(ActionEvent e) {
		String eventvalue = e.getActionCommand();
		
		if(eventvalue.equals("login")) {
			String userid = logintext.getText().trim();
			String passwd = passwdtext.getText().trim();
			
			if(userid.equals("testid")&&passwd.equals("1234")) {
				System.out.println("logged in");
			}else {
				System.out.println("failed");
			}
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public Coupang_1() {
		setLayout(new GridLayout(3,2));
		Label loginal =new Label("userid");
		
		Label passwd =new Label("passwd");
		
		
		Button loginbu = new Button("login");
		loginbu.addActionListener(this);
		Button inputloginbu = new Button("inputlogin");
		
		add(loginal);
		add(logintext);
		add(passwd);
		add(passwdtext);
		add(loginbu);
		add(inputloginbu);
		setSize(200,120);
		setVisible(true);
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		Coupang_1 coupang = new Coupang_1();
	}
}
