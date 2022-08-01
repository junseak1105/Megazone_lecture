package j20220801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException_1 {
	public String NewLine() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		// 입력받을 준비
		String input = buffer.readLine();
		// 출력
		System.out.println(input);

		return input;
	}

	public String Print() throws Exception {
		String strvalue = NewLine();
		return strvalue;
	}
	
	public static void main(String[] args){
		ThrowsException_1 ex = new ThrowsException_1();
		try {
			ex.Print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
