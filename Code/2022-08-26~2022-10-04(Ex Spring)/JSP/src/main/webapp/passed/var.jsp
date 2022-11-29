<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-09-26
  Time: AM 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    table, tr, td {
        border: 1px solid #cccccc;
        border-collapse: collapse;
    }
</style>
<html>
<head><title>Title</title>
</head>
<body>
<table>
    <%
        String[] str = {"java", "jsp", "html"};
        for (int i = 0; i < 3; i++) {
            out.println("<tr>");
            out.println("<td>" + i + "</td>");
            out.println("<td>" + str[i] + "</td>");
            out.println("</tr>");
        }
    %>

    <%
        Date date = new Date();
        int hour = date.getHours();
        int one = 10;
        int two = 12;
    %>
    <%! public int operation(int i, int j){
        return i>j? i:j;
    }
    %>
    <p>지금은 <%=hour%>시 오전? 오후 : <%=hour<12? "오전": "오후"%></p>
    <p><%=one%> or <%=two%> 더 큰 수는 <%=operation(one, two)%></p>

    <hr>

    <% request.setCharacterEncoding("UTF-8"); %>
    <%! String msg; %>
    <%
        String name = request.getParameter("name");
        String color = request.getParameter("color");

        if(color.equals("red")){
            msg = name+"이 선택한 색상은 빨간색";
        }else if(color.equals("blue")) {
            msg = name+"이 선택한 색상은 파란색";
        }else if(color.equals("green")) {
            msg = name+"이 선택한 색상은 초록색";
        }else{
            msg = "목록에 없는 색상임";
        }
    %>
    <p><%=msg%></p>

</table>
</body>
</html>
