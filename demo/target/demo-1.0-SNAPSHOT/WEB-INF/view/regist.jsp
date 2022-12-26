<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/9/2022
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <mvc:form modelAttribute="user" action="addUser" method="post">
        <table>
            <tr>
                <td>Name</td>
                <td>
                    <mvc:input path="name" />
                </td>
            </tr>
            <tr>
                <td>Email</td>
                <td>
                    <mvc:input path="email" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" name="Save" />
                </td>
            </tr>
        </table>
    </mvc:form>
</body>
</html>
