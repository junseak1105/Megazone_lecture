package Sort.j20220802.awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Awt_2 implements WindowListener{
	
	@Override
	public void windowOpened(WindowEvent e) {
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("윈도우를 닫는다.");
		System.exit(0);//시스템 종료
		
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
	
	public Awt_2() {
		Frame fr = new Frame("Banner");
		fr.setSize(200,200);
		fr.setVisible(true);
		fr.addWindowListener(this);
	}
	public static void main(String[] args) {
		
		Awt_2 awt = new Awt_2();
		
	}
}
