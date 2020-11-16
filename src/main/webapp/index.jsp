<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script>
    function getById() {
        var str = document.getElementById("number").value;
        var status = document.getElementById("status");
        if(isEmpty(str)) status.innerHTML = "enter Id";
        else {
            const params = "user_id=" + str;
            var xmlhttp;
            if (window.XMLHttpRequest) xmlhttp = new XMLHttpRequest();
            else xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            xmlhttp.open("POST", "/getUserByID", true);
            xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            xmlhttp.onreadystatechange = function() {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                    status.innerHTML=xmlhttp.responseText;
            }
            xmlhttp.send(params);
        }
    }


    function isEmpty(str){ return (str == null) || (str.length == 0); }
</script>

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
    </div>
</div>

<div align="center">
    <br>
    <p> <b>Enter id</b> </p>
    <p><input type="text" id="number"> </p>
    <p><input type="button" value="Receive" onclick="getById()"></p>
    <p><span id="status"></span></p>
</div>
</body>

</html>