package Sort.questionpool.Phone;

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
