package Awt_Post;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame{


	public LoginFrame() {
		setSize(1000, 1000);
		setVisible(true);
		addWindowListener(new commonWindow());
		setLayout(new BorderLayout());
		
	}
}
