package Post;

public class User {
	String userID;
	String userName;
	int age;
	String Email;
	boolean status=false;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userID, String userName, int age, String Email) {
		this.userID = userID;
		this.userName = userName;
		this.age = age;
		this.Email = Email;
	}
}
