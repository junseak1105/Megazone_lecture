<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <script type="text/javascript" src="/common/js/DaumInsert.js"></script>
</head>
<body>
<form name="frm">
  <table>
    <tr>
      <td>아이디</td>
      <td><input type="text" name="userid" id="" required="required"/></td>
    </tr>
    <tr>
      <td>주제</td>
      <td><input type="text" name="subject" id="" required="required"/></td>
    </tr>
    <tr>
      <td>날짜</td>
      <td><input type="text" name="currentdate" id="" required="required"/></td>
    </tr>
    <tr>
      <td colspan="2"><input type="button" value="작성" onclick="DaumBoardInsert(this.form)"/></td>
    </tr>
  </table>
</form>
</body>
</html>