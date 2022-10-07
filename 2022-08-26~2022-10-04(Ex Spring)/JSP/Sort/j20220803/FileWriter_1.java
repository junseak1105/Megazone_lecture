package Sort.j20220803;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter_1 {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "C:\\project\\share\\questionfile\\test1.txt";
		PrintWriter writer = new PrintWriter(path);
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("1      \n");
		buffer.append("2      \n");
		buffer.append("3      \n");
		
		writer.print(buffer.toString());
		writer.flush();
	}
}
