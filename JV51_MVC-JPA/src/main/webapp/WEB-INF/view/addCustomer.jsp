<%--
  Created by IntelliJ IDEA.
  User: THIEN DO
  Date: 11/11/2022
  Time: 8:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/webjars/bootstrap/5.2.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/5.2.2/css/bootstrap.min.css"/>
    <title>Add customer</title>
</head>
<body>
<div class="container-fluid">
    <div class="row flex-nowrap">
        <div class="col-auto col-md-3 col-xl-2 px-sm-2 px-0 bg-dark">
            <div class="d-flex flex-column align-items-center align-items-sm-start px-3 pt-2 text-white min-vh-100">
                <a href="/" class="d-flex align-items-center pb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                    <span class="fs-5 d-none d-sm-inline">Menu</span>
                </a>
                <ul class="nav nav-pills flex-column mb-sm-auto mb-0 align-items-center align-items-sm-start" id="menu">
                    <li class="nav-item">
                        <a href="customers" class="nav-link align-middle px-0">
                            <i class="fs-4 bi-house"></i> <span class="ms-1 d-none d-sm-inline">Customers</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link align-middle px-0">
                            <i class="fs-4 bi-house"></i> <span class="ms-1 d-none d-sm-inline">Stores</span>
                        </a>
                    </li>
                </ul>
                <hr>
            </div>
        </div>
        <div class="col py-3">
            <form:form modelAttribute="customer" action="saveCustomer" method="post" cssStyle="padding: 20px">
                <div class="row mb-3">
                    <label for="inputName" class="col-sm-2 col-form-label">Name</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputName" path="name"/>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputBirthDate" class="col-sm-2 col-form-label">Birthday</label>
                    <div class="col-sm-10">
                        <form:input type="date" class="form-control" id="inputBirthDate" path="birthDate"/>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputEmail" path="email"/>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputPhone" class="col-sm-2 col-form-label">Phone number</label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" id="inputPhone" path="phone"/>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputStore" class="col-sm-2 col-form-label">Store</label>
                    <div class="col-sm-10">
                        <form:select class="form-control" id="inputStore" path="store.id">
                            <form:option value="0" label="--- Select ---"/>
                            <form:options items="${stores}" />
                        </form:select>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>
    </div>
</div>

</body>
</html>
