package Sort.j20220805.Mega_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

public class Mega_2 {
	public static String path = "/project/share/file1/mega_2/mega_2.txt";
	public static File file = new File(path);

	public void Write() throws Exception {
		PrintWriter write = new PrintWriter(file);
		for (int i = 0; i < 5; i++) {
			write.write("an_" + (i + 1) + "= j20220805.Mega_2.An_" + (i + 1) + "\n");
		}
		write.flush();
	}

	public void Read() throws Exception {
		Properties pro = new Properties();

		pro.load(new FileInputStream(file));
		Enumeration en = pro.elements();

		String str[] = new String[pro.size()];
		int i = 0;
		// Enumeration 에서 키값 or value 추출
		while (en.hasMoreElements()) {
			str[i] = (String) en.nextElement();
			i++;
		}
		for (i = 0; i < str.length; i++) {
			String objectvalue = (String) str[i];
			An me = (An) Class.forName(objectvalue).newInstance();
			me.Print();
		}
	}

	public Mega_2() {
		
	}

	public static void main(String[] args) throws Exception {
		Mega_2 mg = new Mega_2();
		mg.Write();
		mg.Read();
		
	}

}
