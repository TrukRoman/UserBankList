function getTheRichestUser() {
    var xmlhttp;
    if (window.XMLHttpRequest) xmlhttp = new XMLHttpRequest();
    else xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.status == 200)
            document.getElementById("result").innerHTML = xmlhttp.responseText;
    }
    xmlhttp.open("GET", "/GettingRichestUserController", true);
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
    xmlhttp.open("GET", "/GettingSumAccountsController", true);
    xmlhttp.send();
}