package Sort.j20220728;

public class String_1 {

		public static void main(String[] args) {
			
			Character charvalue = '김';
			
			if(charvalue.equals('김')) {
				System.out.println(charvalue+"찾음");
			}
			
			
			String str = new String("김재훈");
			System.out.println(str);
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(2));
			
			System.out.println("===================");
			for (int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
			}
			
			System.out.println("===================");
			
			System.out.println(str.charAt((str.length()/2)));
			
		}
}
