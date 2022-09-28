<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Title</title>
</head>
<body>
<%--
    Cookie cookie = new Cookie("name", "value");
    cookie.setMaxAge(60*2);//초단위
    response.addCookie(cookie);
    response.addCookie(new Cookie("name2", "value2"));
    Cookie[] cookies = request.getCookies();
    if(cookies!=null){};
--%>
<%
    Cookie cookie = new Cookie("name", "홍길동");
    cookie.setMaxAge(60);
    response.addCookie(cookie);
    Cookie[] cookies = request.getCookies();
    if(cookies!=null){
        for(int i=0;i<cookies.length;i++){
            if(cookies[i].getName().equals("name")){
                out.println(cookies[i].getValue());
            }
        }
    }
    Cookie clearCookie = new Cookie("name",null);
    clearCookie.setMaxAge(0);
    response.addCookie(clearCookie);
    out.println(cookies.length);
%>

</body>
</html>
