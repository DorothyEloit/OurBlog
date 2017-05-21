<%@ page import="ourblog.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: 妮子
  Date: 2017/5/7
  Time: 5:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/top.jsp" %>
<a href="<%=ctxpath%>/index.jsp"><div id="returnDiv">返回</div></a>
<div class="infoDiv">
    <form style="padding: 40px;line-height: 40px;" method="get" action="/getUserInfo">
        <%
            User master = (User)session.getAttribute("MASTER");
        %>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">姓名</div>
            <div class="col-md-8"><%=master.getUserName()%></div>
        </div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">性别</div>
            <div class="col-md-8"><%=master.getUserSex()%></div>
        </div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">年龄</div>
            <div class="col-md-8"><%=master.getUserAge()%></div>
        </div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">邮箱</div>
            <div class="col-md-8"><%=master.getEmail()%></div>
        </div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">手机</div>
            <div class="col-md-8"><%=master.getTelephone()%></div>
        </div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">兴趣</div>
            <div class="col-md-8"><%=master.getHobby()%></div>
        </div>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">介绍</div>
            <div class="col-md-8"><%=master.getMessage()%></div>
        </div>
    </form>
</div>
<%@ include file="../include/bottom.jsp" %>
