package Sort.Post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class GetPost extends Navigator{

	public static ArrayList post_content = new ArrayList();
	
	private String Get_filename(String str) {
		String filename = "";
		if (str.equals("공지사항")) {
			return "\\postInform.txt";
		}
		if (str.equals("자유게시판")) {
			return "\\postFree.txt";
		}
		if (str.equals("Gwang_1게시판")) {
			return "\\postGwang_1.txt";
		}
		return filename;
		
	}

	public void Get_by_page(String str, int page) throws Exception {
		
		String path = "C:\\project\\share\\post";
		String filename = Get_filename(str);
		BufferedReader buffer = new BufferedReader(new FileReader(path+filename));
		String post = "";
		while ((post = buffer.readLine()) != null) { // 읽다가 공백 나오면 멈춤
			StringTokenizer token = new StringTokenizer(post,"/");
			Post_content content = new Post_content(Integer.parseInt(token.nextToken()),(String)token.nextToken(), (String)token.nextToken(), (String)token.nextToken(), Integer.parseInt(token.nextToken()), (String)token.nextToken());
			post_content.add(content);
		}
		
	}
	
	public void Show_post() {
		System.out.println("|순서\t|제목\t|작성자\t|작성일\t|조회수");
		System.out.println("========================================");
		for (int i = 0; i < post_content.size(); i++) {
			Hashtable temp = ((Post_content)post_content.get(i)).getHash();
			System.out.println("|"+temp.get("index")+"\t|"+temp.get("title")+"\t|"+temp.get("author")+"\t|"+temp.get("date")+"\t|"+temp.get("hit"));
			System.out.println("-----------------------------------------------------------------------");
		}
		
		//페이지 수 연산(추후 10페이지 출력용)
//		for (int i = page-1; i < page+9; i++) {
//			
//		}
	}

	
	public GetPost() {
		// TODO Auto-generated constructor stub
	}

}
