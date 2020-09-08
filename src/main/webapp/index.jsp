<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>UserBankList</title>
    <script type="text/javascript">
        <%@include file="/WEB-INF/functions.js"%>
    </script>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
            text-align: left;
        }
    </style>
</head>

<h1>UserBankList</h1>
<table>
    <tr><th>№</th><th>parameter</th><th>value</th><th></th></tr>
    <tr>
        <td>1</td>
        <td>the richest users</td>
        <td id="result"></td>
        <td><input type="button" value= "get"onclick="getTheRichestUser()"></td>
    </tr>
    <tr>
        <td>2</td>
        <td>sum of accounts</td>
        <td id="result1"></td>
        <td>
            <input type="button" value= "get" onclick="getAccountsSum()">
        </td>
    </tr>
</table>

<p><b> Show users data by id </b><p>
<p> Enter id </p>
<p><input type="text" id="number"> </p>
<p><input type="button" value="Receive" onclick="getById()"></p>
<p><span id="status"></span></p>

<p><b> Show all accounts </b></p>
<p><input type= "button" value= "Receive" onclick = "getAllAccounts()"></p>
<p><span id="res"></span></p>

</body>
</html>