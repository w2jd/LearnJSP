<%--
  Created by IntelliJ IDEA.
  User: hyund
  Date: 10/18/2018
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<head>
    <title>Event 퍋ㅈ</title>
</head>
<%
    request.setCharacterEncoding("utf-8");
    String jdbc_driver = "com.mysql.jdbc.Driver";
    String jdbc_url = "jdbc:mysql://192.168.10.100:3306/mydb?characterEncoding=utf8&serverTimezone=UTC";
    Class.forName(jdbc_driver);
    Connection conn = DriverManager.getConnection(jdbc_url, "root", "mysql123");

    Statement stmt = conn.createStatement();
    String sql = "select id, title, owner, content from event where id=" + request.getParameter("id");
    ResultSet rs = stmt.executeQuery(sql);
    rs.next();
%>
<body>
<h2>이벤트 내용</h2>
<table>
    <tr>
        <td>ID</td>
        <td><%=rs.getInt("id") %>
        </td>
    </tr>
    <tr>
        <td>Title</td>
        <td><%= rs.getString("title") %>
        </td>
    </tr>
    <tr>
        <td>Owner</td>
        <td><%= rs.getString("owner")%>
        </td>
    </tr>
    <tr>
        <td>Content</td>
        <td><%= rs.getString("content")%>
        </td>
    </tr>
</table>
<br><a href="event_list.jsp">이벤트 목록 보기</a>
</body>
</html>
