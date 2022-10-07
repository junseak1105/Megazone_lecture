package Sort.test1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files_API {
	public static String path = "/project/share/file1";

	public static void main(String[] args) throws IOException {
		Create_File();// 파일 생성
		Get_FileList();// 파일 목록 출력
		Create_Directory();// 폴더 생성
		Read_File(); // 파일 읽기

	}

	// 파일 생성
	public static void Create_File() throws IOException {
		String filecreate[] = { "test2.txt", "test3.txt", "test4.txt", "test5.txt" };
		for (int i = 0; i < filecreate.length; i++) {
			File file2 = new File(path + "/" + filecreate[i]);
			if (!file2.createNewFile()) {
				file2.delete();
			}
			file2.createNewFile();
		}
	}

	// 파일 목록 출력
	public static void Get_FileList() {
		File file = new File(path);
		String filearray[] = file.list();
		for (int i = 0; i < filearray.length; i++) {
			System.out.println(filearray[i]);
		}
	}

	// 폴더 생성
	public static void Create_Directory() {
		String directory[] = { "dir1", "dir2", "dir3", "dir4", "dir5" };
		for (int i = 0; i < directory.length; i++) {
			File filemkdir = new File(path + "\\" + directory[i]);
			filemkdir.mkdir();
		}
	}

	public static void Read_File() {

		// FileReader:파일에 대한 모든 읽기
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(path));
			String inputname = "";
			while ((inputname = buffer.readLine()) != null) { // 읽다가 공백 나오면 멈춤
				System.out.println(inputname);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void File_Write() throws IOException {
		String str = "";
		
		//원래있던 파일 읽어오기
		try {
			BufferedReader buffer1 = new BufferedReader(new FileReader(path + "/home.txt"));
			String inputname = "";
			while ((inputname = buffer1.readLine()) != null) {
				str = str + inputname + "\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//쓰기
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/home.txt"));
		bw.write(str);// 원래있던내용 추가 후 입력받기
		BufferedReader buffer_gettext = new BufferedReader(new InputStreamReader(System.in));
		String input_text = "";
		while (true) {
			input_text = buffer_gettext.readLine();
			if (input_text.equals("0")) {
				break;
			}
			bw.write(input_text + "\n");// 입력받은 내용 넣음
		}
		bw.close();// 혹은 bw.flush() 를 해야 완료
	}

}
