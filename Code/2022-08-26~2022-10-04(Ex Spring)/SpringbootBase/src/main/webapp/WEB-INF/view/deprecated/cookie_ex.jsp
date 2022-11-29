<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //==============================일반적 페이지 접속 단계
    String userId = "",chk1 = "",chk2="";

    //==============================e : 일반적 페이지 접속 단계
    if(request.getParameter("saveId")!=null){//전송버튼을 클릭
        Cookie cook = new Cookie("id",null);
        cook.setMaxAge(0);
        if(request.getParameter("save").equals("id")) {//아이디 저장을 체크했을때
            cook.setValue("1");
            cook.setMaxAge(3600 * 24 * 365);
            chk1 = "checked";
            chk2 = "";
            userId = request.getParameter("id");
        }
        response.addCookie(cook);
    }else{//로그인 페이지에 들어온 경우
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie c: cookies){
                if (c.getName().equals("id")) {
                    userId= c.getValue();
                    chk1="checked"; chk2="";
                    break;
                }else {
                    chk2="checked"; chk1="";
                }
            }
        }
    }

%>
<form action="cookie_ex" name="fn">
    <input type="text" name="id" id="id" maxlength="20" minlength="5" value="<%=userId%>"><br>
    <input type="radio" name="saveID" id="saveID" value="save" <%=chk1%>>ID 저장 <br>
    <input type="radio" name="saveID" id="deleteID" value="delete" <%=chk2%>>ID 삭제 <br>

    <input type="submit" value="전송">
</form>