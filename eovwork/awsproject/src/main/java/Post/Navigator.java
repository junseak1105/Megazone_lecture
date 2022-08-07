package Post;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Navigator implements posts, Auth {
	static String post;
	static int page;
	static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	GetPost gp = new GetPost();

	@Override
	public void Change_status() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ShowPostList(String str, int page) {
		try {
			gp.Get_by_page(str, page);
			gp.Show_post();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PostPage pp = new PostPage();
			pp.Show_Post_page();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void NextPost() {
		this.ShowPostList(post, ++page);
	}

	@Override
	public void PrevPost() {
		this.ShowPostList(post, --page);
	}

	@Override
	public void ViewPost(int num) {
		//ArrayList 안에 post content
		Post_content str = (Post_content)GetPost.post_content.get(num);
		System.out.println((str.getHash()).get("content"));
	}

	public void Navigate(String nav) throws Exception {
		if (nav.equals("공지사항")) {
			post = "공지사항";
			page = 1;
			ShowPostList(post, page);
		}
		if (nav.equals("자유게시판")) {
			post = "자유게시판";
			page = 1;
			ShowPostList(post, page);
		}
		if (nav.equals("Gwang_1게시판")) {
			post = "Gwang_1게시판";
			page = 1;
			ShowPostList(post, page);
		}
		if (nav.equals("회원가입")) {

		}
		if (nav.equals("로그인")) {

		}
		if (nav.equals("로그아웃")) {

		}
		if (nav.equals("글보기")) {
			System.out.println("몇번볼래");
			int num = Integer.parseInt(buffer.readLine());
			ViewPost(num);
			
		}
		if (nav.equals("글작성")) {
			
		}
		if (nav.equals("메인으로")) {
			MainPage mp = new MainPage();
			mp.Show_Main_page();
		}
		if (nav.equals("다음")) {

		}
		if (nav.equals("이전")) {

		}
		if (nav.equals("목록으로")) {
			
		}
	}

	public void Navigator() {

	}
}
