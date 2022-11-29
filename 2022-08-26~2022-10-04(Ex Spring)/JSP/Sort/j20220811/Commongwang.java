package Sort.j20220811;

public class Commongwang {
	private String userid;
	private String subject;
	private String date;
	private int like;
	private int count;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Commongwang() {
		// TODO Auto-generated constructor stub
	}

	public Commongwang(String userid, String subject, String date, int like, int count) {
		this.userid = userid;
		this.subject = subject;
		this.date = date;
		this.like = like;
		this.count = count;
	}
}
