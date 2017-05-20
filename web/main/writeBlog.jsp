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
    <input type="text" class="textTitle" placeholder=" 请输入标题">
    <textarea class="textArea" placeholder=" 请输入内容"></textarea>
    <button class="btn btn-default" id="saveBtn">保存</button>
</div>
<%@ include file="../include/bottom.jsp" %>
