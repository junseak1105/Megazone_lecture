package Sort.questionpool;

public class For_While_Do_while {
	public static void main(String[] args) {
		int[] arr_for = new int[21];
		int[] arr_while = new int[21];
		int[] arr_do_while = new int[21];
		int i = 0;
		int odd = 0;
		int even = 0;

		for (i = 0; i < 21; i++) {
			arr_for[i] = i + 1;
			if (arr_for[i] % 2 == 0) {
				even += arr_for[i];
			} else {
				odd += arr_for[i];
			}
		}
		System.out.println("짝수합:" + even + "홀수합:" + odd);

		i = 0;
		even = 0;
		odd = 0;
		while (i < arr_while.length) {
			arr_while[i] = i + 1;
			if (arr_while[i] % 2 == 0) {
				even += arr_while[i];
			} else {
				odd += arr_while[i];
			}
			i++;
		}
		System.out.println("짝수합:" + even + "홀수합:" + odd);

		i = 0;
		even = 0;
		odd = 0;
		do {
			arr_do_while[i] = i + 1;
			if (arr_do_while[i] % 2 == 0) {
				even += arr_do_while[i];
			} else {
				odd += arr_do_while[i];
			}
			i++;
		} while (i < arr_do_while.length);
		System.out.println("짝수합:" + even + "홀수합:" + odd);

	}
}
