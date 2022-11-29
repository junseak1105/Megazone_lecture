package Sort.questionpool;

public class Home {
	String name;
	int age;
	String address;
	String email;
	String nickname;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public static void main(String[] args) {
		Home home = new Home();
		home.name = "김재훈";
		home.age = 26;
		home.address = "해운대구";
		home.email="june1105@naver.com";
		home.nickname="코딩";
		System.out.println(home.name);
		System.out.println(home.age);
		System.out.println(home.address);
		System.out.println(home.email);
		System.out.println(home.nickname);
		
	}
}
