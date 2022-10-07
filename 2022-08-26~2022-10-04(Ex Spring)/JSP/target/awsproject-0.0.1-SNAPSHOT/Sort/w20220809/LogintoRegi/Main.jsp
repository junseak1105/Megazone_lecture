<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(document).ready(function(){//시작시 세팅
	$("#login").hide();
    $("#register").hide();
    $("#main").show();
});

function To_login(){
	 $("#main").hide();
	 $("#register").hide();
	 $("#login").show();

}
function To_Regi(){
	$("#main").hide();
    $("#login").hide();
    $("#register").show();
}

function To_Main(){
	$("#main").show();
    $("#login").hide();
    $("#register").hide();
}

function Login(){
	var frm = document.loginform;
	if((frm.userid.value=="testid")&&(frm.userpw.value=="testpw")){
		alert("로그인 성공");
		$("#main").show();
		$("#register").hide();
		$("#login").hide();
	}else{
		alert("로그인 실패");
	}
}

function Regi(){
	var frm = document.regiform;
	if(frm.pw.value==frm.pwchk.value){
		alert("아이디:"+frm.id.value+"\n비밀번호:"+frm.pw.value+"\n비밀번호확인:"+frm.pwchk.value+"\n이름:"+frm.name.value+"\n생년월일:"+frm.year.value+"-"+frm.month.value+"-"+frm.day.value+"\n성별:"+frm.sex.value+"\n이메일:"+frm.email.value);
		To_Main();
	}else{
		alert("비밀번호가 다릅니다")
	}
	
}
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="main">
<input type="button" onclick="To_login()" value="로그인" />
<input type="button" onclick="To_Regi()" value="회원가입" />
</div>
<div id="login">
<form action="" name ="loginform" >
	ID <input type="text" name="userid" /><br />
	PW <input type="password" name="userpw" /><br />
	<input type="button" onclick="Login()" value="로그인" />
</form>
<input type="button" onclick="To_Main()" value="메인으로" />
</div>

<div id="register">
<form action="" name="regiform">
	아이디<br>
	<input type="text" name="id" required="true"/><br>
	비밀번호<br>
	<input type="password" name="pw" required="true"/><br>
	비밀번호 재확인<br>
	<input type="password" name="pwchk" required="true"/><br>
	이름<br>
	<input type="text" name="name" required="true"/><br>
	생년월일<br>
	<input type="text" name = "year" placeholder="년(4자)" max="4" required="true"/>
	<select name="month" >
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
		<option value="11">11</option>
		<option value="12">12</option>
	</select>
	<input type="number" name="day"max="31" required="true"/><br>
	성별<br>
	<select name="sex" required="true">
		<option value="male">남</option>
		<option value="female">여</option>
	</select><br>
	본인확인 이메일<br>
	<input type="text" name="email" required="true"/><br>
	<input type="button" onclick="Regi()" value="회원가입" />
	</form>
	<input type="button" onclick="To_Main()" value="메인으로" />
</div>
</body>
</html>