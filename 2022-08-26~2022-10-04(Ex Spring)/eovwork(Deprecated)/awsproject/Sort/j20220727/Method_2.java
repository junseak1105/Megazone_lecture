package Sort.j20220727;

public class Method_2 {
	String name;
	int age;
	String address;
	
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

	public static void main(String[] args) {
		//new:메모리에 올라간다
		Method_2 me = new Method_2();
		me.setName("김현호");
		me.setAge(20);
		me.setAddress("부산");
		System.out.println(me.getName()+"\n"+me.getAge()+"\n"+me.getAddress());
		
		System.out.println("======================================");
		Method_2 me2 = new Method_2();
		System.out.println(me2.getName()+"\n"+me2.getAge()+"\n"+me2.getAddress());
		
		System.out.println("======================================");
		
	}
}
