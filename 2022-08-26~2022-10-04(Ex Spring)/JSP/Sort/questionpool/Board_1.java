package Sort.questionpool;

import java.util.*;

public class Board_1 {
	int num;
	String title;
	String author;
	String date;
	int hit;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public Board_1() {
		// TODO Auto-generated constructor stub
	}

	public Board_1(int num, String title, String author, String date, int hit) {
		this.num = num;
		this.title = title;
		this.author = author;
		this.date = date;
		this.hit = hit;
	}

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Board_1 bd1 = new Board_1();
		bd1.num = 0;
		String title, author, date;
		int num;
		String go = "";
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("계속입력하시겠습니까? 작성을 취소하려면 no 아니면 아무문자");
			go = in.next();
			if(go.equals("no")) {
				break;
			}else {
				System.out.println();
				System.out.print("제목 입력:");
				title = in.next();
				System.out.println();
				System.out.print("작성자 입력:");
				author = in.next();
				System.out.println();
				System.out.print("날짜 입력:");
				date = in.next();
				System.out.println();
				num = bd1.getNum() + 1;
				bd1.setNum(num);
				Board_1 bd = new Board_1(num, title, author, date, 0);
				arrayList.add("\t|" + bd.num + "\t|" + bd.title + "\t\t|" + bd.author + "\t\t|" + bd.date + "\t|" + bd.hit);	
			}
			
		}
		System.out.println("=======================================");
		System.out.println("\t|번호\t|제목\t\t|작성자\t|날짜\t|조회수");
		for (int i =0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
	}
}
