//package questionpool;
//
//import java.awt.Button;
//import java.awt.Frame;
//import java.awt.GridLayout;
//import java.awt.Label;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//import common.CommonHome;
//
//public class Gwang_Home extends Frame implements ActionListener {
//
//	public static ArrayList list = new ArrayList();
//	public TextField namebox = new TextField();
//	public TextField agebox = new TextField();
//	public TextField addressbox = new TextField();
//	public TextField searchbox = new TextField();
//	public Label resultbox = new Label("");
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String str = e.getActionCommand();
//		if (str.equals("search")) {
//			SearchName();
//		}
//		if (str.equals("add")) {
//			AddName();
//		}
//
//	}
//
//	public class WindowEvent extends commonWindow {
//		@Override
//		public void windowClosing(java.awt.event.WindowEvent e) {
//			// TODO Auto-generated method stub
//			super.windowClosing(e);
//		}
//	}
//
//	public class Info extends CommonHome {
//		public Info(String name, int age, String address) {
//			this.setName(name);
//			this.setAge(age);
//			this.setAddress(address);
//		}
//	}
//
//	public Gwang_Home() {
//		setSize(700, 200);
//		setLayout(new GridLayout(8, 2));
//		setVisible(true);
//		addWindowListener(new WindowEvent());
//		Button btn = new Button("search");
//		btn.addActionListener(this);
//		Button btn_add = new Button("add");
//		btn_add.addActionListener(this);
//
//		add(new Label("Name"));
//		add(namebox);
//		add(new Label("Age"));
//		add(agebox);
//		add(new Label("Address"));
//		add(addressbox);
//		add(new Label(""));
//		add(btn_add);
//		add(searchbox);
//		add(btn);
//		add(new Label("Result:"));
//		add(resultbox);
//
//	}
//
//	public void AddName() {
//		if (namebox.getText().equals("")) {
//			resultbox.setText("Invalid name");
//		} else {
//			if (agebox.getText().equals("")) {
//				resultbox.setText("Invalid age");
//			} else {
//				if (addressbox.getText().equals("")) {
//					resultbox.setText("Invalid address");
//				} else {
//					Add_List();
//				}
//			}
//		}
//	}
//
//	public void SearchName() {
//		boolean bool = true;
//		for (int i = 0; i < list.size(); i++) {
//			Info temp = (Info) list.get(i);
//			if (temp.getName().equals(searchbox.getText())) {
//				bool = true;
//				resultbox.setText(
//						"searched- Name:" + temp.getName() + " Age:" + temp.getAge() + " Address:" + temp.getAddress());
//				break;
//			} else {
//				bool = false;
//			}
//		}
//		if (!bool) {
//			resultbox.setText("noResult");
//		}
//	}
//
//	public void Add_List() {
//		Info temp = new Info(namebox.getText(),Integer.parseInt(agebox.getText()),addressbox.getText());
//		list.add(temp);
//		resultbox.setText("Added");
//	}
//
//	public static void main(String[] args) {
//		Gwang_Home gh = new Gwang_Home();
//
//	}
//
//}
