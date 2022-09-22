package Sort.j20220803;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader_1 {

	public static void main(String[] args) {
		//window식 경로
//		String path = "C:\\project\\share\\file1\\test.txt";
		
		//Linux 식 경로
		String path = "C:/project/share/file1/test.txt";
		
		// FileReader:파일에 대한 모든 읽기
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(path));
			String inputname ="";
			while((inputname = buffer.readLine())!=null) { //읽다가 공백 나오면 멈춤
				System.out.println(inputname);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
