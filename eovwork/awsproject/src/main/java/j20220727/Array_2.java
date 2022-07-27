package j20220727;

public class Array_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int i = 0, sum = 0;
		do {
			arr[i] = i + 1;
			i++;

			sum += arr[i];
		} while (i < arr.length);
		
		System.out.println(sum);
	}
}
