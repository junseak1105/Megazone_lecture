package console.common.util;

import console.common.tray.ResultSetTray;
import console.common.tray.Tray;


public class CommonUtil {
	private String txtsearch="";
	private String button="";
	private static String DIR_IMG  = Config.getInstance().getProperty("DIR_IMG");

	/**
	 *�ۼ���:����ȣ 
	 * ����:null�� ������ �� 
	 * @param isnull
	 * @return
	 */
	
	public static String Isnull(String isnull){
		
		if(isnull==null){
			isnull="";
		}
		return isnull.trim();
		
	}
	
	public static String Button(String javascript){ 		
		return "<img style=margin-right:8px src="+DIR_IMG+"search_btn_ok.gif onClick="+javascript+">\n";		
//		return "<input type=button value=click onClick="+javascript+">\n";
//        <td><a href="#"><img  style="margin-right:8px"src="<%=DIR_IMG%>search_btn_ok.gif" /></a></td>		
	}
	
	
	public static String getTxtSerach(String ortxtsearch,String txtsearch){
		
		return "<input size=8 style=margin-left:2px  class=InputLIneGray type=text name="+ortxtsearch+" value="+Isnull(txtsearch)+">\n";
	}
	
	
	public void aetTxtSerach(String txtsearch){
		this.txtsearch=txtsearch;
	
	}
	
	public static String SelectBox(ResultSetTray rstray,Tray tray){
		
		StringBuffer bu=new StringBuffer();
		bu.append("<select name=selectoption> \n");                           
		String select ="";
		
		for(int i=0;i<rstray.getRowCount();i++){
		
			if(tray.getString("selectoption").equals(rstray.get("option_userid",i)))
			{
				select=" selected ";
				bu.append("    	<option value="+rstray.get("option_userid",i)+" "+select+">"+rstray.get("option_userid",i)+"</option> \n");
				
			}else{
				
				bu.append("    	<option value="+rstray.get("option_userid",i)+">"+rstray.get("option_userid",i)+"</option> \n");
			}
		
			select="";
		}
		bu.append("    </select>                                              \n");
		
		//bu.append(getTxtSerach("txtray.get("txtsearch")));
//		bu.append(Button("List()"));
    
		return bu.toString();
	}

//=======================================================================================
//	��   Ī 	 :    select �ڽ� ���� 2
//	�ۼ���        :   �ֽ���		
//��    ¥        :   09-02-05 		
//���� ��¥   :
//=======================================================================================
	
	public static String WorkSelectBox2(ResultSetTray rstray,Tray tray){
		
	StringBuffer bu=new StringBuffer();
	bu.append("<select  style=margin-left:8px name=selectoption2  class =InputLIneSelect> \n");                           
	String select ="";
	
	for(int i=0;i<rstray.getRowCount();i++){
		if(tray.getString("selectoption2").equals(rstray.get("optsystem_key",i)))
		{
			select=" selected ";
			bu.append("    	<option value="+rstray.get("optsystem_key",i)+" "+select+">"+rstray.get("optsystem_key",i)+"</option> \n");
			
		}else{
			
			bu.append("    	<option value="+rstray.get("optsystem_key",i)+">"+rstray.get("optsystem_key",i)+"</option> \n");
		}
	
		select="";
	}
	bu.append("    </select>                                              \n");

	bu.append(getTxtSerach("txtsearch2",tray.get("txtsearch2")));
	
    
	return bu.toString();
}
//=======================================================================================
//	��   Ī 	 :   select �ڽ� ���� 1
//	�ۼ���        :   �ֽ���		
//��    ¥        :   09-02-05 		
//���� ��¥   :
//=======================================================================================

	public static String WorkSelectBox(ResultSetTray rstray,Tray tray){
		
		StringBuffer bu=new StringBuffer();
		bu.append("<select style=margin-left:8px name=selectoption class =InputLIneSelect> \n");                           
		String select ="";
		
		for(int i=0;i<rstray.getRowCount();i++){
		
			if(tray.getString("selectoption").equals(rstray.get("optuser_key",i)))
			{
				select=" selected ";
				bu.append("    	<option value="+rstray.get("optuser_key",i)+" "+select+">"+rstray.get("optuser_key",i)+"</option> \n");
				
			}else{
				
				bu.append("    	<option value="+rstray.get("optuser_key",i)+">"+rstray.get("optuser_key",i)+"</option> \n");
			}
		
			select="";
		}
		bu.append("    </select>                                              \n");
		
		bu.append(getTxtSerach("txtsearch",tray.get("txtsearch")));
		bu.append(Button("List()"));
    
		return bu.toString();
	}

//=======================================================================================
//��   Ī 	 :   �޷��Է¹ڽ� cal1
//�ۼ���     :   �ֽ���		
//��    ¥    :   09-02-06 		
//���� ��¥ :
//dao- �߰� �޷¿ɼ� 
	
	
//	String cal1=reqTray.get("cal1").replaceAll("/","-");
// 	String cal2=reqTray.get("cal2").replaceAll("/","-");;
//	
// 	
// 	if(!cal1.equals("") || !cal2.equals("")){
//		query.append("AND a.logintime and date_format("+Qutter(cal1+" 00:00:00")+","+Qutter("%Y-%m-%d %H:%i:%s")+")" );
//		query.append("and  DATE_FORMAT("+Qutter(cal2+" 23:59:59.")+","+Qutter("%Y-%m-%d %H:%i:%s")+")") ;
//	
//	}	
	//=======================================================================================

	public static String CalTextBoxFrom(Tray tray){
		StringBuffer bu=new StringBuffer();
		bu.append("<input name=cal1 class=InputLIneGray type=text  size=10 value="+tray.get("cal1")+">		 \n"); 
		bu.append("<img src="+DIR_IMG+"search_zoom.gif onClick=popUpCalendar(this,cal1,'yyyy/mm/dd');> ~ \n");


		bu.append("<input name=cal2 class=InputLIneGray type=text  size=10 value="+tray.get("cal2")+">		 \n"); 		 
		bu.append("<img src="+DIR_IMG+"search_zoom.gif onClick=popUpCalendar(this,cal2,'yyyy/mm/dd');> \n");
		bu.append(Button("WorkList()"));
		
		return bu.toString();
	}	
	
//	=======================================================================================
// 	��   Ī 	 :   ��� select �ڽ� ��� 
// 	�ۼ���        :   ����� 		
//	��    ¥       :   09-01-21 		
//	���� ��¥   :
//=======================================================================================
	public static String ServerSelectBox(ResultSetTray rstray,Tray tray){
		
		StringBuffer bu=new StringBuffer();
		bu.append("<select name=selectoption> \n");                           
		String select ="";
		
		for(int i=0;i<rstray.getRowCount();i++){
		
			if(tray.getString("selectoption").equals(rstray.get("optsystem_key",i)))
			{
				select=" selected ";
				bu.append("    	<option value="+rstray.get("optsystem_key",i)+" "+select+">"+rstray.get("optsystem_key",i)+"</option> \n");
				
			}else{
				
				bu.append("    	<option value="+rstray.get("optsystem_key",i)+">"+rstray.get("optsystem_key",i)+"</option> \n");
			}
			select="";
		}
		bu.append("    </select>                                              \n");
		
		bu.append(getTxtSerach("txtsearch",tray.get("txtsearch")));
		bu.append(Button("List()"));
	    
		return bu.toString();
	}
	
//=======================================================================================
//	 ��   Ī 	 :   ����� ����  select �ڽ� ��� 
//	 �ۼ���        :   ����� 		
//	��    ¥        :   09-02-07 		
//	���� ��¥   :
//=======================================================================================
		public static String AdminUserListBox(ResultSetTray rstray,Tray tray){
			
			StringBuffer bu=new StringBuffer();
			bu.append("<select name=selectoption> \n");                           
			String select ="";
			
			for(int i=0;i<rstray.getRowCount();i++){
			
				if(tray.getString("selectoption").equals(rstray.get("optuser_key",i)))
				{
					select=" selected ";
					bu.append("    	<option value="+rstray.get("optuser_key",i)+" "+select+">"+rstray.get("optuser_key",i)+"</option> \n");
					
				}else{
					
					bu.append("    	<option value="+rstray.get("optuser_key",i)+">"+rstray.get("optuser_key",i)+"</option> \n");
				}
			
				select="";
			}
			bu.append("    </select>                                              \n");
			
			bu.append(getTxtSerach("txtsearch",tray.get("txtsearch")));
			bu.append(Button("List()"));
		    
			return bu.toString();
		}

	
	
	

	
	
	
}
