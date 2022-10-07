<%@ page import="console.common.bean.DiabloIndexBean" %>
<%@ page import="java.util.StringTokenizer" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="common.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<%
    DiabloIndexBean temp = (DiabloIndexBean) list.get(0);
%>
<table style="stylewidth:100%;" border="1" height="900">
    <tr>
        <td colspan="2"></td>
        <td><%=request.getAttribute("userid")%>님 환영합니다</td>
    </tr>
    <tr>
        <td style="width:20%"></td>
        <td style="width:60%" valign="top">
            <table height="200" border="1">
                <tr>
                    <td colspan="9" height="100"><img style="width: 100%;height: 100%" src="/common/images/header.png"
                                                      alt="noimg"></td>
                </tr>
                <tr>
                    <%

                        StringTokenizer token_name = new StringTokenizer(temp.getMenuname(), ":");
                        StringTokenizer token_link = new StringTokenizer(temp.getMenulink(), ":");
                        while (token_name.hasMoreTokens()) {
                    %>
                    <td><a href="<%=token_link.nextToken()%>"><%=token_name.nextToken()%></a></td>
                    <%
                        }
                    %>

                </tr>
            </table>
        </td>
        <td style="width:20%"></td>
    </tr>
    <tr>
        <td style="width:20%"></td>
        <td style="width:60%"></td>
        <td style="width:20%"></td>
    </tr>
    <tr>
        <td style="width:20%"></td>
        <td style="width:60%"></td>
        <td style="width:20%"></td>
    </tr>
</table>

<%--<table border="1">--%>
<%--  <tr>--%>
<%--    <th>numIdx</th>--%>
<%--    <th>userid</th>--%>
<%--    <th>boardTitle</th>--%>
<%--    <th>email</th>--%>
<%--    <th>boardCurrDate</th>--%>
<%--    <th>boardCnt</th>--%>
<%--    <th>boardLike</th>--%>
<%--  </tr>--%>
<%--  <%--%>
<%--    for (int i = 0; i < list.size(); i++) {--%>
<%--      Diablo3Bean bean = (Diablo3Bean) list.get(i);--%>

<%--      out.println("<tr>");--%>

<%--      out.println("<td>" + bean.getNumindex() + "</td>");--%>
<%--      out.println("<td>" + bean.getUserid() + "</td>");--%>
<%--      out.println("<td>" + bean.getBoardsubject() + "</td>");--%>
<%--      out.println("<td>" + bean.getEmail() + "</td>");--%>
<%--      out.println("<td>" + bean.getBoardcurrentdate() + "</td>");--%>
<%--      out.println("<td>" + bean.getBoardcount() + "</td>");--%>
<%--      out.println("<td>" + bean.getBoardlike() + "</td>");--%>

<%--      out.println("</tr>");--%>


<%--    }--%>
<%--  %>--%>

<%--</table>--%>
</body>
</html>