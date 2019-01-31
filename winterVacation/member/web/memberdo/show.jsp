<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/1/22
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>显示商品</title>
</head>
<body>
<form>
    <table align="center">
        <tr align="center">
            <td>商品信息列表</td>
        </tr>
        <tr>
            <td width="200">商品名称<%--<input type="text" value="${commodity.name}">--%></td>
            <td>${goods.name}</td>
        </tr>
        <tr>
            <td width="200">商品价格<%--<input type="text" value="${commodity.price}">--%></td>
            <td>${goods.price}</td>
        </tr>
    </table>
</form>
<form method="post" align="center" action="../index.jsp">
    <input type="submit" value="返回">
</form>
</body>
</html>
