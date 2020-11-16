<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 16/11/2020
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
    <title>User Bank List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>

<div class="row">
    <br><br>
    <div class="container">
        <h3 class="text-center">User Bank List</h3>
        <hr>
        <div class="container text-center">
            <a href="<%=request.getContextPath()%>/" class="btn btn-success">Get user by id</a>
            <a href="<%=request.getContextPath()%>/getAllAccounts" class="btn btn-success">Show all acconts</a>
            <a href="<%=request.getContextPath()%>/theRichestUser" class="btn btn-success">Show the richest user</a>
            <a href="<%=request.getContextPath()%>/getSumAccount" class="btn btn-success">Get sum of account's</a>
        </div>
        <br>
        <h1 align="center">Sum of accounts: ${sum}</h1>
    </div>
</div>
</body>

</html>
