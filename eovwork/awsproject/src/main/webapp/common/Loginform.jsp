
<%--<%@include file="../common/Loginform.jsp" %>--%>
<form name="form">
    <table>
        <tr>
            <td>userid</td>
            <td><input type="text" name="userid"/></td>
        </tr>
        <tr>
            <td>passwd</td>
            <td><input type="password" name="passwd" /></td>
        </tr>
<%--        <tr>--%>
<%--            <td>repasswd</td>--%>
<%--            <td><input type="text" name="repasswd" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>age</td>--%>
<%--            <td><input type="text" name="age" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>address</td>--%>
<%--            <td><input type="text" name="address" /></td>--%>
<%--        </tr>--%>
        <tr>
            <td>email</td>
            <td><input type="text" name="email" /></td>
        </tr>
<%--        <tr>--%>
<%--            <td>jumin1</td>--%>
<%--            <td><input type="text" name="jumin1" /></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>jumin2</td>--%>
<%--            <td><input type="text" name="jumin2" /></td>--%>
<%--        </tr>--%>
        <tr>
            <td colspan="2"><input type="button" value="login" onclick="CommonLogin(this.form)"></td>
        </tr>
    </table>
</form>
