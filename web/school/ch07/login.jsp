<%--
  Created by IntelliJ IDEA.
  User: hyund
  Date: 10/11/2018
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="login" class="school.ch07.LoginBean" scope="request" />
<jsp:setProperty name="login" property="*"/>

<html>
<head>
    <title>로그인 결과</title>
    <style>
        body {text-align:center;}
    </style>
</head>
<body>
<h2>로그인 예제</h2>
<hr>
<%
    if(login.getUserid().equals("myuser") && login.getPasswd().equals("1234")) {
        out.println("Login success!");
    } else {
        out.println("Login fail!!!");
    }
%>
<hr>
사용자 아이디 : <jsp:getProperty name="login" property="userid"/>
<br>
사용자 패스워드 : <jsp:getProperty name="login" property="passwd"/>
<br>
<%--모든 값 : <jsp:getProperty name="login" property="*"/>--%>
</body>
</html>
