package Sort.Post;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PostPage extends CommandManager{
	
	public PostPage() throws Exception {
		// TODO Auto-generated constructor stub
	}

	public void Show_Post_page() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		if (!user.isStatus()) {
			System.out.println("1.글보기 2.글작성 3.메인으로 4.다음 5.이전");
			input = Integer.parseInt(buffer.readLine());

			if (input == 1) {
				super.nav("글보기");
			}
			if (input == 2) {
				super.nav("글작성");
			}
			if (input == 3) {
				super.nav("메인으로");
			}
			if (input == 4) {
				super.nav("다음");
			}
			if (input == 5) {
				super.nav("이전");
			}

		} else {
			System.out.println("1.글보기 2.메인으로 3.다음 4.이전");
			input = Integer.parseInt(buffer.readLine());

			if (input == 1) {
				super.nav("글보기");
			}
			if (input == 2) {
				super.nav("메인으로");
			}
			if (input == 3) {
				super.nav("다음");
			}
			if (input == 4) {
				super.nav("이전");
			}
		}
	}

}
