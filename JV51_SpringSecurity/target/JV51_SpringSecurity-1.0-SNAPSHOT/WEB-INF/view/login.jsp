<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/21/2022
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>My form Login</h2>
<form name='loginForm' action="j_spring_security_login" method='POST'>
  <table>
    <tr>
      <td>User:</td>
      <td><input type='text' name='username'></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><input type='password' name='password' /></td>
    </tr>
    <tr>
      <td colspan='2'><input name="submit" type="submit" value="login" /></td>
    </tr>
  </table>
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</body>
</html>
