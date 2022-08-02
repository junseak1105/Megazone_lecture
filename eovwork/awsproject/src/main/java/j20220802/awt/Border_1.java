package j20220802.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Border_1 extends Frame implements ActionListener{

	public Border_1() {
		setLayout(new BorderLayout());
		Button btn = new Button("north");
		btn.addActionListener(this);
		add(btn,BorderLayout.NORTH);
		btn = new Button("west");
		btn.addActionListener(this);
		add(btn,BorderLayout.WEST);
		btn = new Button("east");
		btn.addActionListener(this);
		add(btn,BorderLayout.EAST);
		btn = new Button("south");
		btn.addActionListener(this);
		add(btn,BorderLayout.SOUTH);
		btn = new Button("center");
		btn.addActionListener(this);
		add(btn,BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
		addWindowListener(new WindowEvent());
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String event = e.getActionCommand();
		if(event.equals("north")) {
			System.out.println("north");
		}
		if(event.equals("west")) {
			System.out.println("west");
		}
		if(event.equals("east")) {
			System.out.println("east");
		}
		if(event.equals("south")) {
			System.out.println("south");
		}
		if(event.equals("center")) {
			System.out.println("center");
		}
		
	}


	public class WindowEvent extends commonWindowEvent{
		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
		}
	}
	
	public static void main(String[] args) {
		Border_1 border = new Border_1();
	}
}
