<%@ page import="java.sql.Connection" %>
<%@ page import="ourblog.util.DBUtil" %>
<%--
  Created by IntelliJ IDEA.
  User: 妮子
  Date: 2017/5/7
  Time: 1:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection conn= DBUtil.getPoolConnection();

%>
<html>
<head>
    <title>测试数据库是否连接成功</title>
</head>
<body>
<%=conn!=null%>
</body>
</html>
