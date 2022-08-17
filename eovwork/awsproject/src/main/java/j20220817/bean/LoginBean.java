package j20220817.bean;

import java.util.Enumeration;
import java.util.Hashtable;

public class LoginBean {
	public String userid;
	public String passwd;
	public String email;
	public String jumin1;
	public String jumin2;
	public static Hashtable table;
	public static int index =0;

	public String getJumin1() {
		return jumin1;
	}

	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}

	public String getJumin2() {
		return jumin2;
	}

	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}

	public static void getTable() {
		if (table == null) {
			table = new Hashtable();
		}
	}

	public static void setTable(LoginBean bean) {
		getTable();
		table.put(bean.getJumin1(), bean);
	}

	public String get(String jumin1) {
		
		Enumeration keys = table.keys();
		LoginBean bean = null;
		while(keys.hasMoreElements()) {
			String jumin1value = (String)keys.nextElement();
			if(jumin1value.equals(jumin1)) {
				bean = (LoginBean)table.get(jumin1value);
				System.out.println("userid:"+bean.getUserid());
				System.out.println("passwd:"+bean.getPasswd());
				System.out.println("email:"+bean.getEmail());
				System.out.println("jumin1:"+bean.getJumin1());
				System.out.println("jumin2:"+bean.getJumin2());
			}
		}
		
		String value = (String) table.get(jumin1);
		return value;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public LoginBean(String userid, String passwd, String email,String jumin1,String jumin2) {
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
		this.jumin1=jumin1;
		this.jumin2=jumin2;
	}
}
