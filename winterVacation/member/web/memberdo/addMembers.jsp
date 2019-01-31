<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/1/21
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form align="center" action="<%=request.getContextPath()%>/member.do?names=addMembers" method="post">
    <table align="center">
        <tr align="center">
            <td>会员卡号：</td><td><input type="text" name="MemberNumber" required></td>
        </tr>
        <tr align="center">
            <td>会员昵称：</td><td><input type="text" name="nickName" required></td>
        </tr>
        <tr align="center">
            <td>商品编号：</td><td><input type="text" name="goodsName" required>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
                <input type="button" value="返回" onclick="window.location.href='../index.jsp'">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
