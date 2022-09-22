package Sort.questionpool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_2 {
	public static void main(String[] args) throws IOException {
		String path = "/project/share/questionfile";
		/*
		File file = new File(path+"/home.txt");
		file.createNewFile();
		
		try {
			FileOutputStream output = new FileOutputStream(path+"/home.txt");
		    String str ="오늘 날씨는 아주 좋습니다.";
		    byte[] by=str.getBytes();
		    output.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
		
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(path+"/home.txt"));
			String inputname = "";
			while((inputname =buffer.readLine())!=null) {
				System.out.println(inputname);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		//파일 불러와서 뒷내용 추가하기
		String str = "";
		try {
			BufferedReader buffer1 = new BufferedReader(new FileReader(path+"/home.txt"));
			String inputname = "";
			while((inputname =buffer1.readLine())!=null) {
				str = str+inputname+"\n";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(path+"/home.txt"));
        bw.write(str);
        BufferedReader buffer_gettext = new BufferedReader(new InputStreamReader(System.in));
        String input_text = "";
        while(true) {
        	input_text = buffer_gettext.readLine();
        	if(input_text.equals("0")) {
        		break;
        	}
        	bw.write(input_text+"\n");
        }
        bw.close();
		
	}
}
