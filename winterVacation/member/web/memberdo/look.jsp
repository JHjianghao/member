<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/1/21
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查看</title>
</head>
<body>
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
    </tr>

    <c:forEach items="${collectList}" var="list">
        <tr align="center">
            <td>${list.memberNumber}</td>
            <td>${list.nickName}</td>
            <td><fmt:formatDate value="${list.createTime}" pattern="yyyy--MM--dd HH:mm"/></td>
            <td>${list.name}</td>
            <td>
                <a href="<%=request.getContextPath()%>/goods.do?names=findById&commodity=${list.name}">查看商品</a>
                <a href="<%=request.getContextPath()%>/member.do?id=${list.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<form method="post" align="center" action="../index.jsp">
    <input type="submit"   value="返回">
</form>
</body>
</html>
