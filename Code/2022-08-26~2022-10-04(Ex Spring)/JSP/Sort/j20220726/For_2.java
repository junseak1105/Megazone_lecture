package Sort.j20220726;

public class For_2 {

	public static void main(String[] args) {
		int init = 2;
		if (init % 2 == 0) {
			System.out.println("짝수만 들어온다");
		}

		// 3~20합을 구하시오
		// 짝수와 홀수의 합을 구해서 출력

		int sumeven = 0;
		int sumodd = 0;

		for (int i = 0; i < 21; i++) {
			if (i % 2 == 0) {
				if (i != 4 && i != 6 && i != 10 && i != 20) {
					System.out.println(i);
					sumeven += i;
				}
			} else {
				if (i == 1 || i == 3 || i == 5 || i == 9 || i == 13 || i == 15 || i == 17) {
					sumodd += i;
				}
			}
		}

		System.out.println("짝수합:" + sumeven);
		System.out.println("홀수합:" + sumodd);
	}

}
