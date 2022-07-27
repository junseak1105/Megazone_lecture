package j20220727;

public class If_2 {
	public static void main(String[] args) {
		int one = 30;
		int two = 30;

		if (one >= 30) {
			System.out.println("30보다 같거나 크다");
		} else if (one >= 40) {
			System.out.println("40보다 같거나 크다");
		} else if (one >= 50) {
			System.out.println("50보다 같거나 크다");
		}
		
		int age = 26;
		if(30>age&&age>=20) {
			System.out.println("20대입니다");
		}else if(40>age&&age>=30) {
			System.out.println("30대입니다");
		}else if(50>age&&age>=40) {
			System.out.println("40대입니다");
		}else if(60>age&&age>=50) {
			System.out.println("50대입니다");
		}else if(70>age&&age>=60) {
			System.out.println("60대입니다");
		}
	}
}
