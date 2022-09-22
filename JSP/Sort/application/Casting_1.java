package application;

public class Casting_1 {
	public static int getType(Object ob) {
		//System.out.println(ob.getClass().getName()); 
		if(ob.getClass().getName().equals("java.lang.Integer")) {
			return 1;
		}else if(ob.getClass().getName().equals("java.lang.String")) {
			return 2;
		}
		return 0;
	}
	public Casting_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	}
}
