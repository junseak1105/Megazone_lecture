package sec00.ex01;

import java.sql.Date;


public class BoardVO {
	private int articleNo;
	private String id;
	private String title;
	private String content;
	private Date writedate;
	
	public BoardVO() {
		System.out.println("MemberVO ������ ȣ��");
	}
	
	public BoardVO(int articleNo,String id, String title, String content, Date writedate) {
		super();
		this.articleNo = articleNo;
		this.id = id;
		this.title = title;
		this.content = content;
		this.writedate = writedate;
	}
	public BoardVO(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public BoardVO(int articleNo, String title, String content) {
		super();
		this.articleNo = articleNo;
		this.title = title;
		this.content = content;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

}
