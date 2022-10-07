package console.common.cmd;

import java.util.List;

public class BaseDao {

	public int init=0;
	public List list1;
	
	
	public String Qutter(int choice,String input) {
		
		switch (choice) {
		case 1:
			input="'"+input+"'";
			break;
		case 2:
			input="'"+input+"',";
			break;
		}
		return input;
	}
	
	public String get(Object ob) {
		return 	ob.toString();
	}
	
	
	
}
