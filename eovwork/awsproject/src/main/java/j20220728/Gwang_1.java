package j20220728;

//같은거면 extends
//다른거면 implements


public class Gwang_1  implements Mega_1{
	
	//어노테이션: 오버라이드 @Override 규약
	//오버라이드는 부모 리턴타입 메소드명 (argument 갯수, argument 타입)이 같으면 자식이 오버라이드 됨
	@Override
	public void List() {
		 System.out.println("5반 있음");

	}
	@Override
	public void Print() {
		System.out.println("광안대교 1반");
		
	}
	public static void main(String[] args) {
		Gwang_1 gw = new Gwang_1();
		gw.Print();
		gw.List();
		
		//mega 안에 gwang_1이 속해있다
	
		Mega_1 me = new Gwang_1();
		me.Print();
		me.List();
	}
}
