<%--
  Created by IntelliJ IDEA.
  User: 妮子
  Date: 2017/5/7
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="include/top.jsp" %>
  <div class="loginDiv">
  <form class="form-horizontal" name="login" id="login" action="login" method="post">
      <div class="form-group">
          <label for="username" class="col-sm-4 control-label">用户名</label>
          <div class="col-sm-8">
              <input type="text" class="form-control" name="username" id="username"  placeholder="请输入用户名" />
          </div>
      </div>
      <div class="form-group">
          <label for="password" class="col-sm-4 control-label">密码</label>
          <div class="col-sm-8">
              <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码"/>
          </div>
      </div>
      <div class="form-group">
          <div class="col-sm-offset-4 col-sm-8">
              <input type="submit" name="submit" value="登录" class="btn btn-default">
          </div>
      </div>
  </form>
  </div>
<%@ include file="include/bottom.jsp"%>