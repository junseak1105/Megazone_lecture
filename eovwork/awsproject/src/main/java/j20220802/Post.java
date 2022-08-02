package j20220802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

public class Post {
	public static ArrayList post = new ArrayList();
	public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	String title;
	String author;
	String date;
	int hit;
	int like;
	
	
	public Post(String title,String author,String date,int hit, int like) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.hit = hit;
		this.like = like;
	}
	
	public static int Get_cnt() throws Exception {
		System.out.println("횟수 입력");
		int cnt = Integer.parseInt(buffer.readLine());
		return cnt;
	}
	
	public static void Insert_post(int cnt) throws Exception{
		for (int i = 0; i < cnt; i++) {
			System.out.println("제목입력");
			String title = buffer.readLine();
			System.out.println("작성자입력");
			String author = buffer.readLine();
			String date = "2022-08-02";
			Post pst = new Post(title, author, date, 0, 0);
			post.add(pst);
		}
	}
	
	public static void Print_post() {
		System.out.println("|제목\t\t|작성자\t|날짜\t\t|조회수\t|좋아요");
		for (int i = 0; i < post.size(); i++) {
			Post temp = (Post)post.get(i);
			System.out.println(temp.title+"\t\t"+temp.author+"\t"+temp.date+"\t"+temp.hit+"\t\t"+temp.like);
		}
		
	}
	public static void main(String[] args) throws Exception{
		int cnt = Get_cnt();
		Insert_post(cnt);
		Print_post();
		
		
	}
}
