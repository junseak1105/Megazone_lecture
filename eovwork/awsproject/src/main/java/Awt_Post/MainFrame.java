package Awt_Post;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends Frame{

	public MainFrame() {
		setSize(1000, 1000);
		setVisible(true);
		addWindowListener(new commonWindow());
		setLayout(new BorderLayout());

		

	}

}