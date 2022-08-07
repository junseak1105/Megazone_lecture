package j20220805.book;

public class Phone_Deal {
	public String name = "대리";
	public String jumin1 = "123456";
	public String jumin2 = "455666";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin1() {
		return jumin1;
	}
	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}
	public String getJumin2() {
		return jumin2;
	}
	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}
	
	public Phone_Deal() {
		System.out.println("기본생성자");
	}
	
	public Phone_Deal(String name, int age, String address) {
		
	}
}
