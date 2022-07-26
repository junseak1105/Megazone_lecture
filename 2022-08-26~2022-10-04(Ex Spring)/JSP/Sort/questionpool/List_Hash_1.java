package Sort.questionpool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class List_Hash_1 {
	String title;
	String name;
	String date;
	int hit;
	int like;
	
	public List_Hash_1(String title,String name,String date, int hit, int like) {
		this.title = title;
		this.name = name;
		this.date = date;
		this.hit = hit;
		this.like = like;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		ArrayList array = new ArrayList();
		Hashtable hash = new Hashtable();
				
		
//		int count = Integer.parseInt(buffer.readLine());
//        double answer[] = new double[count];
		for (int i = 1; i <= 5; i++) {
			hash.put(i, new List_Hash_1("title"+i,"이름"+i,"20220729", i, i));
			hash.put(i, new List_Hash_1("title"+i,"이름"+i,"20220729", i, i));
			hash.put(i, new List_Hash_1("title"+i,"이름"+i,"20220729", i, i));
			hash.put(i, new List_Hash_1("title"+i,"이름"+i,"20220729", i, i));
			hash.put(i, new List_Hash_1("title"+i,"이름"+i,"20220729", i, i));
			
		}
		for (int i = 1; i <= hash.size(); i++) {
			array.add(hash.get(i));
		}
		System.out.println("제목\t\t작성자\t\t날짜\t\t\t조회수\t\t좋아요:");
		for (int i = 0; i < array.size(); i++) {
			List_Hash_1 lh = (List_Hash_1)array.get(i);
			System.out.println(lh.title+"\t\t"+lh.name+"\t\t"+lh.date+"\t\t"+lh.hit+"\t\t"+lh.like);
		}
		
		
	}
}
