package j20220803;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Awt_2 extends Frame implements ActionListener,WindowListener {

	public JTextField inputbox;
	public ArrayList array;
	
	
	
	public ArrayList getArray() {
		if(array == null) {
			array = new ArrayList();
		}
		return array;
	}


	public Awt_2(){
		
		JPanel pan = new JPanel();
		
		JTextField inputbox = new JTextField(15);
		JButton inputb = new JButton("input1");
		pan.add(inputbox);
		pan.add(inputb);
		add(pan);
		setSize(300,200);
		setVisible(true);
		addWindowListener(this);
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



	@Override
	public void actionPerformed(ActionEvent e) {
		String strvalue = e.getActionCommand();
		ArrayList array = getArray();
		array.add(inputbox.getText());
		for (int i = 0; i < array.size(); i++) {
			String strvalue2 = (String)array.get(i);
			System.out.println(strvalue2);
		}
		
	}



	public static void main(String[] args) {
		Awt_2 awt = new Awt_2();
	}
}
