package Sort.questionpool;

public class static_question {
	String name;
	int age;
	String address;
	
	public static String name2;
	public static int age2;
	public static String address2;
	
	public static_question(String name, int age, String address,String name2,int age2, String address2) {
		this.name =name;
		this.age = age;
		this.address=address;
		
		this.name2 =name2;
		this.age2 = age2;
		this.address2=address2;
	}
	
	public static_question() {
		
	}
	
	
	
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
		//일반 객체 생성자 통한 입출력
		static_question sq = new static_question();
		System.out.println("이름:"+sq.name+" 나이:"+sq.age+" 주소:"+sq.address);
		
		//일반 객체 getter,setter 통한 입출력
		sq.setName("삼재훈");
		sq.setAge(27);
		sq.setAddress("우동3");
		System.out.println("이름:"+sq.getName()+" 나이:"+sq.getAge()+" 주소:"+sq.getAddress());
		
		//static 객체 입출력
		name2 = "김재훈";
		age2 = 26;
		address2  ="주소";
		System.out.println("이름:"+name2+" 나이:"+age2+" 주소:"+address2);
		
		System.out.println("-----------------------------------------------------------------");
		//둘다 생성자로 입출력
		static_question sq1 = new static_question("이름1", 20, "주소1", "이름2", 21, "이름2");
		System.out.println("전역 변수 출력");
		System.out.println("이름1:"+sq1.name+" 나이1:"+sq1.age+" 주소1:"+sq1.address);
		System.out.println("이름:"+sq1.getName()+" 나이:"+sq1.getAge()+" 주소:"+sq1.getAddress());
		System.out.println("static 변수 출력");
		System.out.println("이름1:"+name2+" 나이1:"+age2+" 주소1:"+address2);
		System.out.println("이름:"+sq1.name2+" 나이:"+sq1.age2+" 주소:"+sq1.address2);
		
	}
	
}
