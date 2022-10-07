package Sort.questionpool;

public class If_Question {

	public static void main(String[] args) {
		int age = 29;

		if (age >= 50) {
			System.out.println("50대");
		} else if (age >= 40) {
			System.out.println("40대");
		} else if (age >= 30) {
			System.out.println("30대");
		} else if (age >= 20) {
			System.out.println("20대");
		}

		if (30 > age && age >= 20) {
			System.out.println("20대입니다");
		}
		if (40 > age && age >= 30) {
			System.out.println("30대입니다");
		}
		if (50 > age && age >= 40) {
			System.out.println("40대입니다");
		}
		if (60 > age && age >= 50) {
			System.out.println("50대입니다");
		}
	}

}
