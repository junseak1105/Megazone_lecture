<%
    if(request.getParameter("chkBox") != null) {
        Cookie ck = new Cookie("chkBox", "hidden");
        ck.setMaxAge(60*2);
        response.addCookie(ck);
    } else {
        Cookie ck = new Cookie("chkBox", null);
        ck.setMaxAge(0);
        response.addCookie(ck);
    }
%>
