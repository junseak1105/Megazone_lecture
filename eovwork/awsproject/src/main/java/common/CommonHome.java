package common;

public class CommonHome {
	
		private String name;
		private int age;
		private String address;
		private String email;
		private String passwd;
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPasswd() {
			return passwd;
		}
		public void setPasswd(String passwd) {
			this.passwd = passwd;
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
		
		public CommonHome(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}
		
//		public static void main(String[] args) {
//			CommonHome comm = new CommonHome();
//			
//			System.out.println(comm.address = "부산");
//			System.out.println(comm.age=20);
//			System.out.println(comm.name="김재훈");
//		}
}
