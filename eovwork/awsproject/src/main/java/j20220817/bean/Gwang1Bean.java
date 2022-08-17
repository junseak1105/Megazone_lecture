package j20220817.bean;

import java.util.ArrayList;

public class Gwang1Bean {
	public String userid;
	public String passwd;
	
	public static ArrayList list;
	
	
	
	
	public static ArrayList getList() {
		if(list==null) {
			list = new ArrayList();
		}
		return list;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public Gwang1Bean(String userid,String passwd) {
		this.userid=userid;
		this.passwd=passwd;
	}
}
