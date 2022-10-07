<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action = "var" name="frm1" method="post">
    <p><label for="name">이름 : </label><input type="text" name="name" id="name"></p>
    <p><label for="color">좋아하는 색상 : </label>
    <select name="color" id="color">
        <option value="red">red</option>
        <option value="green">green</option>
        <option value="blue">blue</option>
    </select>
    </p>
    <p><input type="submit" value="전송하기"></p>
</body>
</html>