package j20220802.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid_1 extends Frame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 1; i <= 9; i++) {
			String str = ""+i;
			if(str.equals(e.getActionCommand())) {
				System.out.println(e.getActionCommand());
			}
		}
	}

	public Grid_1() {
		setLayout(new GridLayout(3, 3));
		for (int i = 1; i <= 9; i++) {
			Button btn = new Button("" + i); // 앞에 ""넣음으로써 자동으로 스트링으로됨
			btn.addActionListener(this);
			add(btn);
		}
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowEvent());
	}

	public class WindowEvent extends commonWindowEvent {
		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
		}
	}

	public static void main(String[] args) {
		Grid_1 grid = new Grid_1();
	}
}
