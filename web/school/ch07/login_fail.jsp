<%--
  Created by IntelliJ IDEA.
  User: hyund
  Date: 10/11/2018
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="userinfo" class="school.ch07.LoginBean" scope="request"/>

<html>
<head>
    <title>로그인 결과</title>
    <style>
        body {
            text-align: center;
        }
    </style>
</head>
<body>
<h2> Login Fail!</h2>
<hr>
사용자 아이디 :
<jsp:getProperty name="userinfo" property="userid"/>
<br>
사용자 패스워드 :
<jsp:getProperty name="userinfo" property="passwd"/>
<br>
에러 코드 :
<jsp:getProperty name="userinfo" property="error"/>
</body>
</html>
