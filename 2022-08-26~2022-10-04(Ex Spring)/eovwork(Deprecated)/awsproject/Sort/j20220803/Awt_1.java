package Sort.j20220803;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;



public class Awt_1{
	
	
	public Awt_1() {
		Frame fr = new Frame();
		fr.setSize(300,300);
		fr.setVisible(true);
		fr.setLayout(new FlowLayout());
		
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
//		btn1.addActionListener(new j20220803.commonWindow());
//		btn2.addActionListener(new j20220803.commonWindow());
//		btn3.addActionListener(new j20220803.commonWindow());
		
		fr.add(btn1);
		fr.add(btn2);
		fr.add(btn3);	
		
		fr.addWindowListener(new commonWindow());
		
	}
	
	public static void main(String[] args) {
		Awt_1 awt = new Awt_1();	
	}
}
