package j20220817.dao;

import java.util.Hashtable;

import j20220817.bean.LoginBean;

//dao: data access object(업무(비즈니스로직))
//mvc:model(업무)controller:리모컨 v:view->front
//mvc1:jsp->bean->jsp

//model
public class LoginDao {
	Hashtable table = new Hashtable();
	
	public void setLogin(String userid,String passwd, String email,String jumin1,String jumin2) {
		LoginBean.setTable(new LoginBean(userid, passwd, email, jumin1, jumin2));
	}
	
	public boolean CheckLogin(String userid, String passwd,String email,String jumin1,String jumin2) {
		
		if(userid.equals("testid")&&passwd.equals("testpw")&&email.equals("testemail@naver.com")) {
			return true;	
		}else {
			return false;
		}
		
		
	}
	
	public LoginBean getDaoLogin(String jumin1) {
		
		return null;
		
	}
}
