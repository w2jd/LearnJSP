<%--
  Created by IntelliJ IDEA.
  User: Doom
  Date: 8/29/2018
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> Hello world 111 123<br> 캬캬캬</h1>
    <%
        int a = 3;
        int b = 4;
        out.println("C = " + (a+b));
    %>

    <!-- Test Post method -->
    <form action="/path1" method="post">
        <input type="submit" value="post test">
    </form>
</body>
</html>
