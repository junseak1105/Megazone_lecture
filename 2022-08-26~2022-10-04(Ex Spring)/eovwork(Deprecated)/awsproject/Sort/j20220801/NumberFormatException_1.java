package Sort.j20220801;

public class NumberFormatException_1 {

	public static void main(String[] args) {
		try {
			int intvalue = Integer.parseInt("abc");
			intvalue+=10;
			System.out.println(intvalue);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
