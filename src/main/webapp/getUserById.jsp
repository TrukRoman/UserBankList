<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 17/11/2020
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>User Bank List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>

<br/>
<div class="row">
    <br><br>
    <div class="container">
        <h3 class="text-center">User Bank List</h3>
        <hr>
        <div class="container text-center">
            <a href="<%=request.getContextPath()%>/" class="btn btn-success">Get user by id</a>
            <a href="<%=request.getContextPath()%>/getAllAccounts" class="btn btn-success">Show all acconts</a>
            <a href="<%=request.getContextPath()%>/getRichestUser" class="btn btn-success">Show the richest user</a>
            <a href="<%=request.getContextPath()%>/getSumAccount" class="btn btn-success">Get sum of account's</a>
        </div>
        <br>

        <div align="center">
            <p><b>Enter id</b></p>
            <form method="post" action="/getUserByID">
                <input type="number" name="user_id"/>
                <br/><br/>
                <input type="submit" value="get user"/>
            </form>
        </div>

        <table class="table table-bordered">
            <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Account</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    ${user.user_id}
                </td>
                <td>
                    ${user.name}
                </td>
                <td>
                    ${user.surname}
                </td>
                <td>
                    ${user.account.account}
                </td>
            </tr>
            </tbody>

        </table>
    </div>
</div>
</body>

</html>

