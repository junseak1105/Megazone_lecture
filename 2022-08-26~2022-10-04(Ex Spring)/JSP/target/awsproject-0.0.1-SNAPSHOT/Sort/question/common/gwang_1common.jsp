<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-22
  Time: 오후 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Sort.j20220822.bean.Gwang_1Bean"%>
<%@ page import="Sort.j20220822.dao.Gwang_1Dao" %>
<%
    CommonUtil.BaseCommonPNames(request);

    Gwang_1Dao gw1dao = new Gwang_1Dao();

    ArrayList mysql_list = gw1dao.Gwang_member("mysql");
    ArrayList oracle_list = gw1dao.Gwang_member("oracle");
    Boolean login_chk = gw1dao.Gwang_login_chk("oracle");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
