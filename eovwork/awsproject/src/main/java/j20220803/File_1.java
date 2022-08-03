package j20220803;

import java.io.File;
import java.io.IOException;

public class File_1 {

	
	public static void main(String[] args) throws IOException {
		
		String path = "/project/share/file1";
		
		File file = new File(path);
		String filearray[] = file.list();
		for (int i = 0; i < filearray.length; i++) {
			System.out.println(filearray[i]);
		}
		
		String filecreate[] = {"test2.txt","test3.txt","test4.txt","test5.txt"};
		for (int i = 0; i < filecreate.length; i++) {
			File file2 = new File(path+"/"+filecreate[i]);
			file2.createNewFile();
		}
	}
}
