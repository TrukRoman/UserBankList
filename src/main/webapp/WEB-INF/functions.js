function getTheRichestUser() {
    var xmlhttp;
    if (window.XMLHttpRequest) xmlhttp = new XMLHttpRequest();
    else xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.status == 200)
            document.getElementById("result").innerHTML = xmlhttp.responseText;
    }
    xmlhttp.open("GET", "/GetTheRichestUserController", true);
    xmlhttp.send();
}

function getAccountsSum() {
    var xmlhttp;
    if (window.XMLHttpRequest) xmlhttp = new XMLHttpRequest();
    else xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.status == 200)
            document.getElementById("result1").innerHTML = xmlhttp.responseText;
    }
    xmlhttp.open("GET", "/GetSumAccountsController", true);
    xmlhttp.send();
}

function getById() {
    var str = document.getElementById("number").value;
    var status = document.getElementById("status");
    if(isEmpty(str)) status.innerHTML = "enter Id";
    else {
        const params = "user_id=" + str;
        var xmlhttp;
        if (window.XMLHttpRequest) xmlhttp = new XMLHttpRequest();
        else xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        xmlhttp.open("POST", "/GetUserByIDController", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.onreadystatechange = function() {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                status.innerHTML=xmlhttp.responseText;
        }
        xmlhttp.send(params);
    }
}
function isEmpty(str){ return (str == null) || (str.length == 0); }

function getAllAccounts(){
    var xmlhttp;
    if (window.XMLHttpRequest) xmlhttp = new XMLHttpRequest();
    else xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
            document.getElementById("res").innerHTML=xmlhttp.responseText;
    }
    xmlhttp.open("GET", "/GetAllAccountsController", true);
    xmlhttp.send();
}