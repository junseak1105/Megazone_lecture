package Sort.j20220803;

public class Static_1 {

	public String name;
	public static String address;
	public int init =0;
	
	public Static_1() {
		System.out.println(++init);
	}
	
	
	public static void main(String[] args) {
		
		Static_1 static_1 = new Static_1();
		
		System.out.println(static_1);
		static_1.address="부산";
		System.out.println(Static_1.address);
		
		
		System.out.println("========");
		for (int i = 1; i <= 5; i++) {
			new Static_1();
		}
	}
}
