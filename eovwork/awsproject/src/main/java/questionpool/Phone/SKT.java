package questionpool.Phone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SKT extends Phone_new{
	
	public SKT() throws Exception {
		super.Choose_place();
		super.EditFile();
		super.ShowList();
		
	}
	
	public static void main(String[] args) throws Exception {
		SKT skt = new SKT();
	}
}