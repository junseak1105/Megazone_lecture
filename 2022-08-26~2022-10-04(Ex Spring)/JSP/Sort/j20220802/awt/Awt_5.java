package Sort.j20220802.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class Awt_5 extends Frame {

	public Awt_5() {
		addWindowListener(new WindowEvent());// 윈도우 이벤트 리스너 생성
		setLayout(new FlowLayout()); //레이아웃 왼쪽에서 오른쪽
		for (int i = 1; i <= 5; i++) {
			Button btn = new Button("btn" + i); // 버튼 생성
			btn.addActionListener(new ActionEvent()); // 버튼에 액션 부여
			add(btn); // Frame에 버튼 추가
		}
		setSize(300, 300);
		setVisible(true);
	}

	public class ActionEvent implements ActionListener {

		@Override
		public void actionPerformed(java.awt.event.ActionEvent e) {
			for (int i = 1; i <= 5; i++) {
				String str = "btn" + i;
				if (str.equals(e.getActionCommand())) {
					System.out.println(e.getActionCommand());
				}
			}
		}
	}

	public class WindowEvent extends commonWindowEvent {
		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			super.windowClosing(e);
		}
	}

	public static void main(String[] args) {
		Awt_5 awt = new Awt_5();
	}
}
