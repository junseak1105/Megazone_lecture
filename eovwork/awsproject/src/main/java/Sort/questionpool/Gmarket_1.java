package Sort.questionpool;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;

public class Gmarket_1 extends Frame implements ActionListener {

	public JTextField IDbox = new JTextField(15);
	public JTextField PWbox = new JTextField(15);
	public Label result = new Label();

	public ArrayList array = new ArrayList();
	
	String ID;
	String PW;
	
	public Gmarket_1(String ID, String PW) {
		this.ID = ID;
		this.PW = PW;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String strvalue = e.getActionCommand();
		if (strvalue.equals("Login")) {
			Login_CHK();
		}
		if (strvalue.equals("Register")) {
			Register();
		}

	}

	public void Login_CHK() {
		for (int i = 0; i < array.size(); i++) {
			Gmarket_1 temp = (Gmarket_1)array.get(i);
			if (IDbox.getText().equals(temp.ID) && PWbox.getText().equals(temp.PW)) {
				result.setText("loginSuccess-ID:"+temp.ID);
			}	
		}
	}
	public boolean Regi_CHK() {
		for (int i = 0; i < array.size(); i++) {
			Gmarket_1 temp = (Gmarket_1)array.get(i);
			if (IDbox.getText().equals(temp.ID)) {
				return false;
			}
		}
		return true;
		
	}
	public void Register() {
		if (IDbox.getText().equals("")) {
			result.setText("Invalid ID");
		} else {
			if (PWbox.getText().equals("")) {
				result.setText("Invalid PW");
			} else {
				if(Regi_CHK()) {
					array.add(new Gmarket_1(IDbox.getText(), PWbox.getText()));
					result.setText("Registered");
				}else {
					result.setText("Existing ID");
				}
				
			}
		}
	}

	public Gmarket_1() {
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new commonWindow());

		// west panel

		Panel p_west = new Panel();
		p_west.setLayout(new GridLayout(2, 2));
		Label l_ID = new Label("ID");
		Label l_PW = new Label("PW");
		p_west.add(l_ID);
		p_west.add(IDbox);
		p_west.add(l_PW);
		p_west.add(PWbox);

		// east panel

		Panel p_east = new Panel();
		Button btn1 = new Button("Login");
		btn1.addActionListener(this);
		p_east.add(btn1);

		// south panel

		Panel p_south = new Panel();
		p_south.setLayout(new FlowLayout());
		Button btn2 = new Button("Register");
		btn2.addActionListener(this);
		p_south.add(btn2);
		p_south.add(result);

		// main
		setLayout(new BorderLayout());
		add(p_west, BorderLayout.WEST);
		add(p_east, BorderLayout.EAST);
		add(p_south, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		Gmarket_1 gm = new Gmarket_1();
	}
}
