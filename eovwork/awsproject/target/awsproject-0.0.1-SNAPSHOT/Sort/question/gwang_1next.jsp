<%@ page import="util.CommonUtil" %>
<%@ page import="Sort.j20220822.dao.Gwang_1Dao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Sort.j20220822.bean.Gwang_1Bean" %><%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-22
  Time: 오후 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/Sort/question/common/gwang_1common.jsp"%>


<html>
<head>
    <title>Title</title>
</head>
<body>
입력받은 값
<%=CommonUtil.BaseCommonPNSearch("userid")%>
<%=CommonUtil.BaseCommonPNSearch("passwd")%>
<%=CommonUtil.BaseCommonPNSearch("name")%>
<%=CommonUtil.BaseCommonPNSearch("email")%>
<%=CommonUtil.BaseCommonPNSearch("jumin1")%>
<%=CommonUtil.BaseCommonPNSearch("jumin2")%>
<%

    out.println("<br>mysql 받아오기<br>");
    for (int i = 0; i < mysql_list.size(); i++) {
        Gwang_1Bean temp = (Gwang_1Bean) mysql_list.get(i);
        out.println("아이디"+temp.getUserid()+" 비번:"+temp.getPasswd()+" 이름:"+temp.getName()+" 이메일:"+temp.getEmail()+" 주민번호:"+temp.getJumin1()+"-"+temp.getJumin2()+"<br>");
    }
    out.println("오라클 받아오기<br>");
    for (int i = 0; i < oracle_list.size(); i++) {
        Gwang_1Bean temp = (Gwang_1Bean) oracle_list.get(i);
        out.println("아이디"+temp.getUserid()+" 비번:"+temp.getPasswd()+" 이름:"+temp.getName()+" 이메일:"+temp.getEmail()+" 주민번호:"+temp.getJumin1()+"-"+temp.getJumin2()+"<br>");
    }
    out.println("<br>");
    if(login_chk){
        out.println("로그인됨");
    }else{
        out.println("로그인 실패");
    }

%>


</body>
</html>
