package Sort.j20220803;

import java.io.File;
import java.io.IOException;

public class File_3 {
	public static void main(String[] args) throws IOException {
		String path = "C:\\project\\share\\questionfile";
		File file = new File(path);
		
		file.mkdir();
		
		String filetxt[] = {"test1.txt","test2.txt","test3.txt","test4.txt","test5.txt"};
		
		for (int i = 0; i < filetxt.length; i++) {
			File filenew = new File(path+"\\"+filetxt[i]);
			filenew.createNewFile();
		}
		
		String directory[] = {"dir1","dir2","dir3","dir4","dir5"};
		
		for (int i = 0; i < directory.length; i++) {
			File filemkdir = new File(path+"\\"+directory[i]);
			filemkdir.mkdir();
		}
		
		System.out.println("--------------------------------");
		File file5 = new File(path);
		if(file5.isDirectory()) {
			System.out.println("디렉토리입니다.");
		}
		System.out.println("--------------------------------");
		String str[] = file5.list();
		for (int i = 0; i < str.length; i++) {
			File file6 = new File(path+"\\"+str[i]);
			if(file6.isDirectory()) {
				System.out.println("디렉토리:"+str[i]);	
			}else {
				System.out.println("파일:"+str[i]);
			}
			
		}
	}
}
