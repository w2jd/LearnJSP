<%--
  Created by IntelliJ IDEA.
  User: hyund
  Date: 10/18/2018
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<head>
    <title>Event add</title>
</head>
<%
    request.setCharacterEncoding("utf-8");
    String jdbc_driver = "com.mysql.jdbc.Driver";
    String jdbc_url = "jdbc:mysql://192.168.10.100:3306/mydb?characterEncoding=utf8&serverTimezone=UTC";
    Class.forName(jdbc_driver);
    Connection conn = DriverManager.getConnection(jdbc_url, "root", "mysql123");

    String sql = "insert into event values(?,?,?,?)";
    PreparedStatement stmt = conn.prepareStatement(sql);
%>

<body>
<h2>이벤트 추가</h2>
ID : <%=request.getParameter("id") %> <br>
Title : <%=request.getParameter("title") %> <br>
Owner : <%=request.getParameter("owner") %> <br>
content : <%=request.getParameter("content") %> <br>

<%
    stmt.setInt(1, Integer.parseInt(request.getParameter("id")));
    stmt.setString(2, request.getParameter("title"));
    stmt.setString(3, request.getParameter("owner"));
    stmt.setString(4, request.getParameter("content"));

    stmt.executeUpdate();
    stmt.close();
    conn.close();

%>
위 일정이 추가되었습니다.

<br><a href="event_list.jsp">이벤트 목록 보기</a>
</body>
</html>
