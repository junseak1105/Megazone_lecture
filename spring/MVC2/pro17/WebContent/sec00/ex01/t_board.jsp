<%@ page language="java" contentType="text/html; charset=UTF-8"
         import=" java.util.*,sec00.ex01.*"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <style>
        .cls1 {
            font-size: 40px;
            text-align: center;
        }

        .cls2 {
            font-size: 20px;
            text-align: center;
        }
    </style>

</head>
<body>
<p class="cls1">게시판</p>
<table align="center" border="1">
    <tr align="center" bgcolor="lightgreen">
        <td width="7%"><b>아이디</b></td>
        <td width="7%"><b>제목</b></td>
        <td width="7%"><b>내용</b></td>
        <td width="7%"><b>작성일</b></td>
        <td width="3%"><b>삭제</b></td>
    </tr>

    <c:choose>
        <c:when test="${ empty boardList}">
            <tr>
                <td colspan=5 align="center">
                    <b>등록된 회원이 없습니다.</b>
                </td>
            </tr>
        </c:when>
        <c:when test="${!empty boardList }">
            <c:forEach var="board" items="${boardList }">
                <tr align="center">
                    <td>${board.id }</td>
                    <td>${board.title }</td>
                    <td>${board.content}</td>
                    <td>${board.writedate}</td>
                    <td><a href="/pro17/board.do?type=delete&articleNo=${board.articleNo}">삭제</a> </td>
                </tr>
            </c:forEach>
        </c:when>
    </c:choose>
</table>
<a href="#"><p class="cls2">회원 가입하기</p></a>
</body>
</html>
