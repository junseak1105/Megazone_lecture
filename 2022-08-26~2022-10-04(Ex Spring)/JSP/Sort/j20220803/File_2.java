package Sort.j20220803;

import java.io.File;
import java.io.IOException;

public class File_2 {

	
	public static void main(String[] args) throws IOException {
		String path = "/project/share/questionfile";
		File file =new File(path);
		file.createNewFile();
		if(file.isDirectory()) {
			System.out.println("디렉토리입니다");
		}
		if(file.isFile()) {
			System.out.println("파일입니다.");
		}
	}
	
}
