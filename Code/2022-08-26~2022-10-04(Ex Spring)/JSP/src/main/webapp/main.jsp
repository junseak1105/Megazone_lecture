<%@ page import="com.web.prtClass.*" %>
<%@ page import="com.web.prtClass.Cal" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Title</title>
    <style>
        #container {
            width: 100%;
            height: 100%;
            border:1px solid #ccc;padding:100px;
        }
    </style>
</head>
<jsp:include page="include/header.jsp"/>
<body>
<div id="container">
    <%= Cal.cmdPrt(10,5)%>
</div>
</body>
<jsp:include page="include/footer.jsp"/>
</html>
