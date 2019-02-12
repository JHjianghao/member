<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/11
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>添加评论</title>
</head>
<body>
<form method="post" id="id" action="<%=request.getContextPath()%>/News_commentServlet.do?transfer=Add&id=<%=request.getParameter("id")%>" name="id">
    <table>
        <tr>
            <td>评论内容</td><td><input type="text" name="content" required></td>
        </tr>
        <tr>
            <td>评论人</td><td><input type="text" name="author" required></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
                <input type="button" value="返回" onclick="window.location.href='index.jsp'">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
