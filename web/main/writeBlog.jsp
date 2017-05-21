<%--
  Created by IntelliJ IDEA.
  User: 妮子
  Date: 2017/5/7
  Time: 5:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/top.jsp" %>
<a href="<%=ctxpath%>/main/msg.jsp"><div id="returnDiv">返回</div></a>
<div class="infoDiv">
    <form class="form-horizontal" name="saveBlog" id="saveBlog" action="<%=ctxpath%>/saveBlog" method="post">
        <div class="form-group">
    <input type="text" class="textTitle" placeholder=" 请输入标题" name="title">
        </div>
        <div class="form-group">
    <textarea class="textArea" placeholder=" 请输入内容" name="content"></textarea>
        </div>
        <select name="perClass" id="perClass">
            <option selected="selected" value="所有人可见">所有人可见</option>
            <option value="仅自己可见">仅自己可见</option>
        </select>
        <div class="btn-group" id="blogClass">
            <button type="button" class="btn btn-default dropdown-toggle blogClassBtn" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                学习记录 <span class="caret"></span>
            </button>
            <ul class="dropdown-menu dropClassMenu">
                <li><a href="#">学习记录</a></li>
                <li><a href="#">日记本</a></li>
                <li><a href="#">随笔</a></li>
            </ul>
        </div>
        <button class="btn btn-default" id="saveBtn">保存</button>

    </form>
</div>
<%@ include file="../include/bottom.jsp" %>
