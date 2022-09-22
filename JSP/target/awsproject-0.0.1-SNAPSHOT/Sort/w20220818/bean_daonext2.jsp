<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Hashtable" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%!
    public static ArrayList list;

    public static ArrayList getList() {
        if(list==null) {
            list = new ArrayList();
        }
        return list;
    }
%>

<%
    Hashtable hash = new Hashtable();
    hash.put("id",request.getParameter("userid"));
    hash.put("pw",request.getParameter("passwd"));
    getList().add(hash);
%>
<!doctype html>
<html lang="en">
<head>
</head>
<body>
<%
    for (int i = 0; i < list.size(); i++) {
        Hashtable temp = (Hashtable) list.get(i);
        out.print(i+"번 로그인");
        out.print("id"+temp.get("id")+" pw:"+temp.get("pw"));
        out.print("<br>");
    }
%>
</body>
</html>
<script type="text/javascript">
</script>