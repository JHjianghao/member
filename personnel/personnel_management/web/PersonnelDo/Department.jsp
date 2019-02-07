<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/4
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>根据部门查看</title>
</head>
<body>
<table align="center">
    <tr align="center">
        <td colspan="7">
            人才信息表
        </td>
    </tr>
    <tr align="center">
        <td width="200">人才编号</td>
        <td width="200">人才姓名</td>
        <td width="200">工作年限</td>
        <td width="200">所属部门</td>
        <td width="200">毕业学校</td>
        <td width="200">操作</td>
    </tr>
    <c:forEach items="${transformList}" var="transformsList">
        <tr align="center">
            <td>${transformsList.id}</td>
            <td>${transformsList.name}</td>
            <td>${transformsList.workingLife}</td>
            <td>${transformsList.departmentIdName}</td>
            <td>${transformsList.graduateSchool}</td>
            <td>
                <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=update&${transformsList.id}">修改</a>
                <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=delete&${transformsList.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<table>
    <p align="center">
        <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=findAll&pagination=1">首页</a>
        <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=findAll&pagination=${page-1}">上一页</a>
        <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=findAll&pagination=${page+1}">下一页</a>
        <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=findAll&pagination=${totalPage}">尾页</a>
        第${page}页/共${totalPage}页
    </p>
    <%--<p align="center"><%=session.getAttribute("message")%>></p>--%>
</table>
</body>
</html>
