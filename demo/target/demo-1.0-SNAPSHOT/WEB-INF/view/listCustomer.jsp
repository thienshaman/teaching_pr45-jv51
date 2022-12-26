<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/11/2022
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.2/css/bootstrap.min.css" />
    <title>Title</title>
</head>
<body>
    <table class="table">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Phone</th>
            <th>Email</th>
        </tr>
        <c:forEach var="c" items="${customers}">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.birthdate}</td>
                <td>${c.phone}</td>
                <td>${c.email}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
