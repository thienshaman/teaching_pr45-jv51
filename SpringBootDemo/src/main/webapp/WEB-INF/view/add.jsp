<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/26/2022
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form method="get" action="demo" modelAttribute="account">
        <form:input path="id" />
        <form:input path="ownerName" />
        <form:input path="balance" />
        <input type="submit">
    </form:form>
</body>
</html>
