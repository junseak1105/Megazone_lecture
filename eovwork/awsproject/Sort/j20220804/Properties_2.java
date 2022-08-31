package Sort.j20220804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Properties_2 {

	
	public static void main(String[] args) throws IOException {
		
		Properties pro = new Properties();
		String path = "/project/share/questionfile/common.properties";
		//\project\share\questionfile
		File file = new File(path);
		
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String inputname = "";
		
		while((inputname = buffer.readLine()) !=null) {
			System.out.println(inputname);
		}
		
		
		
		
		
	}
}
