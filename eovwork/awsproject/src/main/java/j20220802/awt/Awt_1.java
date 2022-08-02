package j20220802.awt;

import java.awt.Button;
import java.awt.Frame;

public class Awt_1 extends Frame{
	
	public Awt_1() {
		Button button = new Button("button");
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Awt_1 awt = new Awt_1();
		
	}
}
