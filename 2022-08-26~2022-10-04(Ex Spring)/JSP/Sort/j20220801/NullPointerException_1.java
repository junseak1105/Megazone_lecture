package Sort.j20220801;

public class NullPointerException_1 {
	public static void main(String[] args) {
		//NullPointerException: null값을 다른 것으로 바꿀 때
		try {
			//null:초기화 (아무것도 없다)
			String name = null;
			name =name.toUpperCase();
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
