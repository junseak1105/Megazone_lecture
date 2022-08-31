package Sort.j20220801.mega;

public class Instance_1 {
	public String name = "김재훈";
	public static void main(String[] args) throws Exception {
		Instance_1 inst = (Instance_1)Class.forName("j20220801.mega.Instance_1").newInstance(); //문자열을 인스턴스로
		System.out.println(inst.name);
		
		System.out.println("==============");
		
		Instance_1 inst2 = new Instance_1();
		System.out.println(inst2.name);
	}
}
