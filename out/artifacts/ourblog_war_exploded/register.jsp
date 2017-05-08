<%--
  Created by IntelliJ IDEA.
  User: 妮子
  Date: 2017/5/7
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎来到箩玛西亚</title>
    <link href="css/index.css" rel="stylesheet" type="text/css">
    <link href="css/starStyle.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
    <script type="text/javascript" src="bootstrap/js/jquery.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body>

<div class="loginDiv">
    <form class="form-horizontal" name="register" id="register" action="register" method="post">
        <div class="form-group">
            <label for="username" class="col-sm-4 control-label">昵称</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="username" id="username"  placeholder="昵称" />
            </div>
        </div>
        <div class="form-group">
            <label for="username" class="col-sm-4 control-label">手机号</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" name="telephone" id="telephone"  placeholder="手机号" />
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-4 control-label">密码</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" name="password" id="password" placeholder="密码"/>
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-4 control-label">确认密码</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" name="repassword" id="repassword" placeholder="确认密码"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-4 col-sm-8">
                <input type="submit" name="submit" value="注册" class="btn btn-default">
                <button class="btn btn-default" style="background:rgba(255,255,255,0.3);"><a href="index.jsp" style="text-decoration:none;color:#FFFFFF;">返回</a></button>
            </div>
        </div>
    </form>
</div>
<div class="stars"></div>
<div class="twinkling"></div>
</body>
</html>
