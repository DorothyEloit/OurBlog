<%@ page import="ourblog.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: 妮子
  Date: 2017/5/7
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include/top.jsp" %>
<%
    User user = (User)session.getAttribute("USER");
%>
<body class="bodyStyle">
<%
    if(user == null) {
%>
<a href="./main/login.jsp" id="loginClick">登录</a>
<%
    } else {
        session.invalidate();
%>
<a href="index.jsp" id="logoutClick">注销</a>
<%
    }
%>
<div id="menuTop">个人资料</div>
<div id="menuLeft">看博客</div>
<div id="menuRight">写博客</div>
<div id="menuBottom">管理博客</div>
<%@ include file="include/bottom.jsp"%>