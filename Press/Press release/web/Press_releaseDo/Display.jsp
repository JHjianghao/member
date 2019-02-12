<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/11
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/News_detailServlet.do?transfer=findById">
    <table align="center">
        <tr align="center">
            <td colspan="7">
               新闻
            </td>
        </tr>
    </table>
    <table align="center">
        <tr align="center" height="40px">
            <td align="center" >新闻标题:</td><td>
            <input type="text" align="center" name="title"  required>&nbsp;&nbsp;
        </td>
            <td>
                <input type="submit" value="查找">
            </td>
            <td>
                <input type="button" value="添加" onclick="window.location.href='Press_releaseDo/Add.jsp'">
            </td>
        </tr>
    </table>
    <table>
        <tr align="center">
            <td width="200">新闻编号</td>
            <td width="200">新闻标题</td>
            <td width="200">新闻摘要</td>
            <td width="200">作者</td>
            <td width="200">创建时间</td>
            <td width="200">操作</td>
        </tr>
        <c:forEach items="${transformList}" var="transformsList">
            <tr align="center">
                <td>${transformsList.id}</td>
                <td>${transformsList.title}</td>
                <td>${transformsList.summary}</td>
                <td>${transformsList.author}</td>
                <td>${transformsList.createdate}</td>
                <td>
                    <a href="<%=request.getContextPath()%>/News_commentServlet.do?transfer=findAll&id=${transformsList.id}">查看评论</a>
                    <a href="Press_releaseDo/Add.jsp?id=${transformsList.id}">评论</a>
                    <a href="<%=request.getContextPath()%>/News_detailServlet.do?transfer=Delete&id=${transformsList.id}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <table>
        <p align="center">
            <a href="<%=request.getContextPath()%>/News_detailServlet.do?transfer=findAll&pagination=1">首页</a>
            <a href="<%=request.getContextPath()%>/News_detailServlet.do?transfer=findAll&pagination=${page-1}">上一页</a>
            <a href="<%=request.getContextPath()%>/News_detailServlet.do?transfer=findAll&pagination=${page+1}">下一页</a>
            <a href="<%=request.getContextPath()%>/News_detailServlet.do?transfer=findAll&pagination=${totalPage}">尾页</a>
            第${page}页/共${totalPage}页
        </p>
        <%--<p align="center"><%=session.getAttribute("message")%>></p>--%>
    </table>
</form>
</body>
</html>
