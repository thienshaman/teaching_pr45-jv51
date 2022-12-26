<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/25/2022
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Home page</h1>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Balance</th>
        </tr>
        <c:forEach var="a" items="${accounts}">
            <tr>
                <td>${a.id}</td>
                <td>${a.ownerName}</td>
                <td>${a.balance}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
