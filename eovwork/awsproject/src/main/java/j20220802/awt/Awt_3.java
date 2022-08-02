package j20220802.awt;

import java.awt.Frame;
import java.awt.event.WindowListener;

public class Awt_3 extends Frame {

	public Awt_3() {
		setSize(300, 300);
		setVisible(true);

		// 윈도우 이벤트 클래스 호출
		addWindowListener(new WindowEvent());
	}

	// inner class: 이너 클래스는 바깥에 있는 모든 메소드나 변수를 쓸 수 있다.
	// api 단위로 처리량 많을 때 사용
	
	public class WindowEvent extends commonWindowEvent {
		public void windowClosing(java.awt.event.WindowEvent e) {
			//부모 메소드 호출
			super.windowClosing(e);
		}
	}

	public static void main(String[] args) {
		Awt_3 awt = new Awt_3();
	}
}
