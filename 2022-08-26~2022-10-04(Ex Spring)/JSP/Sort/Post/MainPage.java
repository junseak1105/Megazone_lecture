package Sort.Post;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainPage extends CommandManager {

	public MainPage() throws Exception {
		// TODO Auto-generated constructor stub
	}

	public void Show_Main_page() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		if (!user.isStatus()) {
			System.out.println("1.회원가입 2.로그인 3.공지사항 4.자유게시판 5.Gwang_1게시판");
			input = Integer.parseInt(buffer.readLine());

			if (input == 1) {
				super.nav("회원가입");
			}
			if (input == 2) {
				super.nav("로그인");
			}
			if (input == 3) {
				super.nav("공지사항");
			}
			if (input == 4) {
				super.nav("자유게시판");
			}
			if (input == 5) {
				super.nav("Gwang_1게시판");
			}

		} else {
			System.out.println("1.로그아웃 2.공지사항 3.자유게시판 4.Gwang_1게시판");
			input = Integer.parseInt(buffer.readLine());

			if (input == 1) {
				super.nav("로그아웃");
			}
			if (input == 2) {
				super.nav("공지사항");
			}
			if (input == 3) {
				super.nav("자유게시판");
			}
			if (input == 4) {
				super.nav("Gwang_1게시판");
			}
		}
	}

}
