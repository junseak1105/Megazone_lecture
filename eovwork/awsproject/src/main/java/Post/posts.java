package Post;

import java.io.IOException;

public interface posts {
	public void ShowPostList(String str,int page);
	public void NextPost();
	public void PrevPost() throws IOException;
	public void ViewPost(int num);
}
