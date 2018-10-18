<%--
  Created by IntelliJ IDEA.
  User: hyund
  Date: 10/18/2018
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="javax.xml.transform.Result" %>
<html>
<head>
    <title>Event list</title>
</head>
<%
    request.setCharacterEncoding("utf-8");
    String jdbc_driver = "com.mysql.jdbc.Driver";
    String jdbc_url = "jdbc:mysql://192.168.10.100:3306/mydb?characterEncoding=utf8&serverTimezone=UTC";

    Class.forName(jdbc_driver);
    Connection conn = DriverManager.getConnection(jdbc_url, "root", "mysql123");

    Statement stmt = conn.createStatement();
    String sql = "select id, title, owner from event";
    ResultSet rs = stmt.executeQuery(sql);
%>

<body>
<h2>이벤트 목록</h2>
<table border="1">
    <tr>
        <th>Index</th>
        <th>Title</th>
        <th>Owner</th>
    </tr>
    <%
        while (rs.next()) {
    %>
    <tr>
        <td><%=rs.getInt("id") %></td>
        <td>
            <a href="event_view.jsp?id=<%=rs.getString("id")%>">
                <%=rs.getString("title")%>
            </a>
        </td>
        <td><%=rs.getString("owner")%>
        </td>
    </tr>
    <%
        }
        rs.close();
        stmt.close();
        conn.close();
    %>
</table>
<br>
<hr>
<form action="event_add.jsp" method="post">
    ID <input type="text" name="id" size="15">
    Title <input type="text" name="title" size="15">
    Owner <input type="text" name="owner" size="10"><br>
    Content <input type="text" name="content" size="40"> <br>
    <input type="submit" value="이벤트 추가"/>
</form>

</body>
</html>
