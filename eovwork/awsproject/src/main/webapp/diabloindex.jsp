<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file = "/diablo3common.jsp" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>


<table border="1">
  <tr>
    <th>numIdx</th>
    <th>userid</th>
    <th>boardTitle</th>
    <th>email</th>
    <th>boardCurrDate</th>
    <th>boardCnt</th>
    <th>boardLike</th>
  </tr>
  <%
    for (int i = 0; i < list.size(); i++) {
      Diablo3Bean bean = (Diablo3Bean) list.get(i);

      out.println("<tr>");

      out.println("<td>" + bean.getNumindex() + "</td>");
      out.println("<td>" + bean.getUserid() + "</td>");
      out.println("<td>" + bean.getBoardsubject() + "</td>");
      out.println("<td>" + bean.getEmail() + "</td>");
      out.println("<td>" + bean.getBoardcurrentdate() + "</td>");
      out.println("<td>" + bean.getBoardcount() + "</td>");
      out.println("<td>" + bean.getBoardlike() + "</td>");

      out.println("</tr>");


    }
  %>

</table>
</body>
</html>