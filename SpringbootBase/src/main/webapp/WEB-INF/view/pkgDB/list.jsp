<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-10-04
  Time: PM 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ page import="com.jhk.pkgDB.*"%>
<%@ page import="java.util.ArrayList" %>
<html>
<head><title>Title</title>
</head>
<body>
<table>
<%
    int pageNum = 1;
    int groupNum = 2;
    DBDao dao = new DBDao();
    ArrayList<DBBean> list = dao.getList(pageNum,groupNum);
%>
<%
    for (int i = 0; i < list.size(); i++) {
%>
<tr>
    <td><%=list.get(i).getIdx()%></td>
    <td><%=list.get(i).getPart()%></td>
</tr>
<%
}
%>
</table>
</body>
</html>
