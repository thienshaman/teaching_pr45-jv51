<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/9/2022
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Add Student Form</h1>
    <mvc:form modelAttribute="student" action="registStudent" method="post">
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
                <td>Tel</td>
                <td>
                    <mvc:input path="tel" />
                </td>
            </tr>
            <tr>
                <td>Gpa</td>
                <td>
                    <mvc:input path="gpa" />
                </td>
            </tr>
            <tr>
                <td>Level</td>
                <td>
                    <mvc:input path="level" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit">
                </td>
            </tr>
        </table>
    </mvc:form>
</body>
</html>
