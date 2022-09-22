package Sort.Awt_Post;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Navbar extends Frame{
	
	public Panel navbar = new Panel();

	public Button btn_post = new Button("Sort/Post");
	public Button btn_login = new Button("Login");
	public Button btn_regi = new Button("Register");
	
	public Navbar() {
		
		navbar.setVisible(true);
		navbar.setLayout(new FlowLayout());
		navbar.add(btn_post);
		navbar.add(btn_login);
		navbar.add(btn_regi);
		
	}
	
}
