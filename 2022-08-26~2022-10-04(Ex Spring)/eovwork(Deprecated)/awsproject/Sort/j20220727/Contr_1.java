package Sort.j20220727;

public class Contr_1 {
	String name;
	int age;
	String address;
	String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contr_1() {
		System.out.println("기본생성자");
	}
	public Contr_1(String name,int age, String email, String address) {
		this.name= name;
		this.age=age;
		this.address=address;
		this.email=email;
	}
	public static void main(String[] args) {
		//기본 생성자는 생략이 가능하다
		Contr_1 con = new Contr_1();
		con.setName("김재훈");
		con.setAge(26);
		con.setAddress("해운대");
		con.setEmail("june1105@naver.com");
		
		System.out.println("이름:"+con.getName()+"\n나이:"+con.getAge()+"\n주소:"+con.getAddress()+"\n이메일:"+con.getEmail());
		
		System.out.println("====================================");
		Contr_1 con2 = new Contr_1("이재훈",25,"해운대구","june22");
		System.out.println("이름:"+con2.name+"\n나이:"+con2.age+"\n주소:"+con2.address+"\n이메일:"+con.email);
		
		
	}
}
