package Sort.j20220727;

public class Array_4 {
	public static void main(String[] args) {
		char[] charvalue = new char[3];
		charvalue[0]='일';
		charvalue[1]='빌';
		charvalue[2]='김';
		
		for (int i = 0; i < charvalue.length; i++) {
			System.out.println(charvalue[i]);
			if(charvalue[i]=='김') {
				System.out.println(charvalue[i]+"씨 검색됨");
			}
			
		}
		
	}
}
