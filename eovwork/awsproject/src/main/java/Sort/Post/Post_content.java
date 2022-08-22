package Sort.Post;

import java.util.Hashtable;

public class Post_content {
	Hashtable hash = new Hashtable();

	public Hashtable getHash() {
		return hash;
	}

	public void setHash(Hashtable hash) {
		this.hash = hash;
	}

	public Post_content(int index,String title,String author,String date,int hit,String content) {
		hash.put("index", index);
		hash.put("title", title);
		hash.put("author", author);
		hash.put("date", date);
		hash.put("hit", hit);
		hash.put("content", content);
	}
}
