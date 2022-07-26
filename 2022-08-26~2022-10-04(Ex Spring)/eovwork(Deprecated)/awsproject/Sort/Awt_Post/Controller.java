package Sort.Awt_Post;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends Frame implements ActionListener {
	MainFrame mf = new MainFrame();
	LoginFrame lf = new LoginFrame();

	@Override
	public void actionPerformed(ActionEvent e) {
		String strvalue = e.getActionCommand();
		if (strvalue.equals("Sort/Post")) {
		System.out.println(strvalue);
		}
		if (strvalue.equals("Login")) {
			Close_All();
			lf.setVisible(true);
		}
		if (strvalue.equals("Register")) {
			System.out.println(strvalue);
		}
	}
	
	public Controller() {
		Inject_Nav();
		Close_All();
		mf.setVisible(true);
		
	}
	public void Close_All(){
		mf.setVisible(false);
		lf.setVisible(false);
	}
	
	public void Inject_Nav() {
		Navbar Nav = new Navbar();
		Nav.btn_post.addActionListener(this);
		Nav.btn_login.addActionListener(this);
		Nav.btn_regi.addActionListener(this);
		mf.add(Nav.navbar, BorderLayout.NORTH);
		lf.add(Nav.navbar, BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		Controller control = new Controller();
	}
}
