package j20220727;

public class While_1 {

	public static void main(String[] args) {
		int init = 1;
		int sum = 0;
		
		while (++init<=10) {
			sum += init;
		}
		System.out.println(sum);
		
		int sumeven = 0;
		int sumodd = 0;
		
		int j = 0;
		while(++j<22) {
			if (j % 2 == 0) {
				if (j != 4 && j != 6 && j != 10 && j != 20) {
					
					sumeven += j;
				}
			} else {
				if (j != 7 && j != 11 && j != 19) {
					sumodd += j;
				}
			}
		}

		System.out.println("짝수합:" + sumeven);
		System.out.println("홀수합:" + sumodd);

	}

}
