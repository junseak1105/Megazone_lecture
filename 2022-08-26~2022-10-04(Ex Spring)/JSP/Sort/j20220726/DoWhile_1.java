package Sort.j20220726;

public class DoWhile_1 {

	public static void main(String[] args) {
		int init = 0;
		int sum = 0;
		do {
			System.out.println(init);
		} while (++init <= 10);
		
		int sumeven = 0;
		int sumodd = 0;
		
		int j = 0;
		do{
			if (j % 2 == 0) {
				if (j != 4 && j != 6 && j != 10 && j != 20) {
					
					sumeven += j;
				}
			} else {
				if (j != 7 && j != 11 && j != 19) {
					sumodd += j;
				}
			}
		}while(++j<22);

		System.out.println("짝수합:" + sumeven);
		System.out.println("홀수합:" + sumodd);

	}
	
	

}
