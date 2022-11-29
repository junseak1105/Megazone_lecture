package Sort.Awt_Post;

import java.awt.BorderLayout;
import java.awt.Frame;

public class MainFrame extends Frame{

	public MainFrame() {
		setSize(1000, 1000);
		setVisible(true);
		addWindowListener(new commonWindow());
		setLayout(new BorderLayout());

		

	}

}
