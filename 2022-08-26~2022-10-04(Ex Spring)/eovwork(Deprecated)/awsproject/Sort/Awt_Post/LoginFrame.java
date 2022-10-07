package Sort.Awt_Post;

import java.awt.BorderLayout;
import java.awt.Frame;

public class LoginFrame extends Frame{


	public LoginFrame() {
		setSize(1000, 1000);
		setVisible(true);
		addWindowListener(new commonWindow());
		setLayout(new BorderLayout());
		
	}
}
