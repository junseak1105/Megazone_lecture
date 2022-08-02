package j20220802.awt;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CommonAwtEvent implements WindowListener, ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String strvalue = e.getActionCommand();
		
		if(strvalue.equals("Login")) {
			TextField Id = NaverAwt_1.getId();
			TextField Pw = NaverAwt_1.getPasswd();
			System.out.println("ID: "+Id.getText()+"\tPW: "+Pw.getText());
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}
