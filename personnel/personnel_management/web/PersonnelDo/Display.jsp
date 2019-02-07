<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/3
  Time: 23:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=findById">
    <table align="center">
        <tr align="center" height="40px">
            <td>部门名称:
                <input type="text" name="departmentIdName" list="departmentIdName" required>&nbsp;&nbsp;
                <datalist  id="departmentIdName">
                    <option value ="开发">开发</option>
                    <option value ="人事">人事</option>
                    <option value="行政">行政</option>
                </datalist >
                <input type="submit" value="查询">
                <input type="button" value="新增人员" onclick="window.location.href='PersonnelDo/Add.jsp'">
            </td>
        </tr>
    </table>
</form>
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
            <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=LookId&id=${transformsList.id}">修改</a>
            <a href="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=Delete&id=${transformsList.id}">删除</a>
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
