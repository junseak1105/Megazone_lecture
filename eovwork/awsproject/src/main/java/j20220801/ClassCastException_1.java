package j20220801;

public class ClassCastException_1 {
	
	public static void main(String[] args) {
		try {
			Object ob = new Integer(1); //Deprecated: 구버전이라 저대로는 안나옴
			int strvalue = (int)ob;
		} catch (ClassCastException e) {
			e.printStackTrace();

		}
	}
}
