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
<form method="post" action="<%=request.getContextPath()%>/member.do?names=findById">
    <table align="center">
        <tr align="center" height="40px">
            <td>会员卡号:
                <input type="text" name="MemberNumber" required>&nbsp;&nbsp;
                <input type="submit" value="查询">
                <input type="button" value="添加" onClick="window.location.href='memberdo/addMembers.jsp'">
            </td>
        </tr>
    </table>
</form>
<%--
<button onclick="/memder.do?name = dindAll"/>
--%>
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

    <c:forEach items="${collectList}" var="list">
        <tr align="center">
            <td>${list.memberNumber}</td>
            <td>${list.nickName}</td>
            <td><fmt:formatDate value="${list.createTime}" pattern="yyyy--MM--dd HH:mm"/></td>
            <td>${list.name}</td>
            <td>
                <a href="<%=request.getContextPath()%>/goods.do?names=findById&commodity=${list.name}">查看商品</a>
                <a href="<%=request.getContextPath()%>/member.do?names=delete&id=${list.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<table>
    <p align="center">
        <a href="<%=request.getContextPath()%>/member.do?names=findAll&currentPage=1">首页</a>
        <a href="<%=request.getContextPath()%>/member.do?names=findAll&currentPage=${current-1}">上一页</a>
        <a href="<%=request.getContextPath()%>/member.do?names=findAll&currentPage=${current+1 }">下一页</a>
        <a href="<%=request.getContextPath()%>/member.do?names=findAll&currentPage=${totalPage}">尾页</a>
        第${current}页/共${totalPage}页
    </p>
    <p align="center"><%session.getAttribute("message");%></p>

</table>
</body>
</html>
