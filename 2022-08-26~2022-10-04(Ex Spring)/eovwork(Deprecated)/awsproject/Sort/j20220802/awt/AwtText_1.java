package Sort.j20220802.awt;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class AwtText_1 extends Frame{

	public AwtText_1() {
		setSize(300,300);
		setVisible(true);
		Panel bodypanel = new Panel();
		
		addWindowListener(new CommonAwtEvent());
		
		TextField login = new TextField(15);
		login.addActionListener(new CommonAwtEvent());
		TextField passwd = new TextField(15);
		passwd.addActionListener(new CommonAwtEvent());
		
		bodypanel.add(login);
		bodypanel.add(passwd);
		
		add(bodypanel);
		
	}
	
	
	public static void main(String[] args) {
		AwtText_1 text = new AwtText_1();
	}
	
}
