<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="com.jhk.BeanEx.BeanEx" scope="page" />
<jsp:setProperty name="user" property="*" />


<html>
<head><title>Title</title>
</head>
<body>
로그인 실패
<jsp:getProperty name="user" property="userId" />
<jsp:getProperty name="user" property="userName" />
<jsp:getProperty name="user" property="userPw" />


</body>
</html>
