<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!-- 상대경로 사용, [현재 URL이 속한 계층 경로 + /save] -->
<table>
    <thead>
    <th>번호</th>
    <th>작성자</th>
    <th>제목</th>
    <th>날짜</th>
    </thead>
    <tbody>
    <c:forEach var="item" items="${boardbean}">
        <tr>
            <td>${item.numberindex}</td>
            <td>${item.userid}</td>
            <td>${item.subject}</td>
            <td>${item.currentdate}</td>
        </tr>
    </c:forEach>
    </tbody>
</body>
</html>