package j20220817.dao;

import java.util.Hashtable;

//dao: data access object(업무(비즈니스로직))
//mvc:model(업무)controller:리모컨 v:view->front
//mvc1:jsp->bean->jsp

//model
public class LoginDao2 {
	Hashtable table = new Hashtable();
	public boolean CheckLogin(String userid, String passwd,String email,String jumin1,String jumin2) {
		System.out.println(passwd);
		if(userid.equals("testid")&&passwd.equals("testpw")&&email.equals("testemail@naver.com")&&jumin1.equals("11111")&&jumin2.equals("22222")) {
			return true;	
		}else {
			return false;
		}
		
		
	}
}
