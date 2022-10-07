package Sort.j20220727;

public class Array_5 {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("===================");
		
		int array2[] = new int[10];
		for (int i = 0; i < array2.length; i++) {
			array2[i]=i+1;
			System.out.println(array2[i]);
		}
		
		System.out.println("===================");
		
//		int array3[][] = new int[3][3];
		int array3[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
//				System.out.print("\t 행"+i+"\t"+j);
				System.out.print(array3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("===================");
		int array4[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int sum = 0;
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4.length; j++) {
				sum += array4[i][j];
			}
		}
		System.out.println("1~9의 합"+sum);
		
	}
}
