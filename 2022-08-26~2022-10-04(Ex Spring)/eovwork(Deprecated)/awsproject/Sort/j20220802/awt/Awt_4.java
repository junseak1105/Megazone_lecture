package Sort.j20220802.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Awt_4 extends Frame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionevent = e.getActionCommand();
		
		if(actionevent.equals("btn1")) {
			System.out.println(actionevent);
		}
		if(actionevent.equals("btn2")) {
			System.out.println(actionevent);
		}
		if(actionevent.equals("btn3")) {
			System.out.println(actionevent);
		}
		if(actionevent.equals("btn4")) {
			System.out.println(actionevent);
		}
		if(actionevent.equals("btn5")) {
			System.out.println(actionevent);
		}

	}

	public Awt_4() {

		Panel bodypanel = new Panel();
		Button btn1 = new Button("Button1");
		Button btn2 = new Button("Button2");
		Button btn3 = new Button("Button3");
		Button btn4 = new Button("Button4");
		Button btn5 = new Button("Button5");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		bodypanel.add(btn1);
		bodypanel.add(btn2);
		bodypanel.add(btn3);
		bodypanel.add(btn4);
		bodypanel.add(btn5);

		add(bodypanel);

		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowEvents());

	}

	public class WindowEvents extends commonWindowEvent {
		@Override
		public void windowClosing(WindowEvent e) {
			super.windowClosing(e);
		}
	}

	public static void main(String[] args) {
		Awt_4 awt = new Awt_4();
	}
}
