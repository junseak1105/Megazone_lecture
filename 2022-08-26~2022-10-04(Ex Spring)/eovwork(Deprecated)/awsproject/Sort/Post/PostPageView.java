package Sort.Post;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PostPageView extends CommandManager{
	
	public PostPageView() throws Exception {
		// TODO Auto-generated constructor stub
	}

	public void Show_PostPageView() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		if (!user.isStatus()) {
			System.out.println("1.목록으로");
			input = Integer.parseInt(buffer.readLine());

			if (input == 1) {
				super.nav("목록으로");
			}

		
		}
	}

}
