<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/1/18
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>登录展示页面</title>
</head>
<body>
<%request.getAttribute("list")%>
<form method="post" action="<%=request.getContextPath()%>/member.do?name=findById">
    <table align="center" border="1" cellspacing="0" cellpadding="8">
        <tr align="center" height="40px">
            <td>会员卡号:<input name="membership">&nbsp;
                <input type="submit" value="查询" >&nbsp;
                <input type="button" value="添加" onClick="window.location.href='addMembers.jsp'">
            </td>
        </tr>
    </table>
</form>
<form method="post" action="/member.do?name=findAll">
    <table align="center">
        <tr align="center">
            <td colspan="5">
                会员信息列表
            </td>
        </tr>
        <tr align="center">
            <td width="200">会员卡号</td>
            <td width="200">昵称</td>
            <td width="200">申请时间</td>
            <td width="200">最新购买商品</td>
            <td width="200">操作</td>
        </tr>
        <c:forEach items="${list}"  var="list">
            <tr align="center">
                <td>${list.memberNumber}</td>
                <td>${list.nickName}</td>
                <td><fmt:formatDate value="${list.createTime}" pattern="yyyy--MM--dd HH:mm"/></td>
                <td>${list.name}</td>
                <td>
                    <a href="<%=request.getContextPath()%>/goods.do?name=${list.name}">查看商品</a>
                    <a href="<%=request.getContextPath()%>/member.do?id=${list.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
