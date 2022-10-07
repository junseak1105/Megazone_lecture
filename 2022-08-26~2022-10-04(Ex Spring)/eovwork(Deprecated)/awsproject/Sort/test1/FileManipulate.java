package Sort.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileManipulate {
	private static String path = "/project";
	private static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	/*
	 * 직접 파일 만드는곳 path input 파일 있는지 체크 디렉토리 있는지 체크
	 */
	
	
	private void Mkdir() {
		File file = new File(path);
		if (!file.mkdir()) {
			System.out.println("이미 존재하는 디렉토리입니다.");
		} else {
			file.mkdir();
			System.out.println("디렉토리 생성 완료");
		}
	}
	
	private void Create_File(String Filename) throws Exception {
			File file = new File(path + "/" + Filename);
			if (!file.createNewFile()) {
				System.out.println("이미 존재하는 파일입니다.");
//				file.delete();
			}else {
				file.createNewFile();	
				System.out.println(path+"/"+Filename+"에 파일을 생성하였습니다.");
			}
			
	}
	
	private void ShowDir() {
		File file = new File(path);
		String arr[] = file.list();
		System.out.println("파일목록");
		for (int i = 0; i < arr.length; i++) {
			File file2 = new File(path+"/"+arr[i]);
			if(file2.isDirectory()) {
				System.out.println(i+"."+arr[i]+"(디렉토리)");	
			}else {
				System.out.println(i+"."+arr[i]);
			}
			
		}
	}
	
	private void Move_dir() {
		File file = new File(path);
		if(file.isDirectory()) {
			System.out.println("경로를 이동하였습니다.");
		}else {
			System.out.println("존재하지않는 경로입니다.");
			path = "/project";
		}
	}
	
	private void Write_File() throws Exception {
		File file = new File(path);
		if(file.isFile()) {
			PrintWriter write = new PrintWriter(file);
			write.write(buffer.readLine());
			write.flush();
			System.out.println("작성완료");
		}else {
			System.out.println("잘못된 파일명 입니다.");
		}
		
	}
	
	public FileManipulate() throws Exception {
		while (true) {
			System.out.println("1.경로 설정 2.파일 생성 3.파일 목록 4.디렉토리 생성 5.파일수정 6.종료");
			System.out.println("현재 경로:"+path);
			int str = Integer.parseInt(buffer.readLine());
			if (str == 1) {
				System.out.println("이동할 경로를 입력하세요. 빈칸은 base 경로로 이동.");
				path = "/project/"+buffer.readLine();
				Move_dir();
			}else if(str == 2) {
				System.out.println("파일명을 입력하세요.");
				String Filename = buffer.readLine();
				this.Create_File(Filename);
			}else if(str==3){
				this.ShowDir();
				
			}else if(str==4){
				System.out.println("현재 경로에 만들 폴더명을 입력하세요.");
				path = "/project/"+buffer.readLine();
				Mkdir();
				
			}else if(str == 5) {
				System.out.println("수정할 파일명을 입력하세요.");
				path = "/project/"+buffer.readLine();
				this.Write_File();
			}else if(str==6) {
				break;
			}else {
				continue;
			}
		}
	}

	

	public static void main(String[] args) throws Exception {
		FileManipulate fc = new FileManipulate();
		
	}
}
