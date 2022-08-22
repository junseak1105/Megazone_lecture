package Sort.Post;

public class CommandManager extends Navigator {
	public static User user = new User();

	public void nav(String string) throws Exception {
		super.Navigate(string);
	}

	public CommandManager() {
	}
	
	
	public static void main(String[] args) throws Exception {
		CommandManager cm = new CommandManager();
		cm.nav("메인으로");
		

	}

}
