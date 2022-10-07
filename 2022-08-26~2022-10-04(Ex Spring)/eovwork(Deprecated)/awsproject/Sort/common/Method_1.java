package Sort.common;

public class Method_1 {

	public String name;
	public int age;
	public String address;

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

		Method_1 me = new Method_1();
		me.setName("김재훈");
		me.setAge(26);
		me.setAddress("부산");
		
		System.out.println(me.getName()+me.getAge()+me.getAddress());

	}
}
