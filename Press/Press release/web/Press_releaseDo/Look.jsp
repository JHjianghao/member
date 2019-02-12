<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/11
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查看评论</title>
</head>
<body>
<form method="post">
    <table align="center">
        <tr align="center">
            <td colspan="7">
                评论
                <input align="center" onclick="window.location.href='index.jsp'">
            </td>
        </tr>
    </table>
    <table>
        <tr align="center">
            <td width="200">评论编号</td>
            <td width="200">评论内容</td>
            <td width="200">评论人</td>
            <td width="200">评论时间</td>
        </tr>
        <c:forEach items="${transformList}" var="transformsList">
            <tr align="center">
                <td>${transformsList.id}</td>
                <td>${transformsList.content}</td>
                <td>${transformsList.author}</td>
                <td>${transformsList.createdate}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
