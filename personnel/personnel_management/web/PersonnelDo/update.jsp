<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/4
  Time: 0:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>修改</title>
</head>
<body>

<form align="center" method="post" action="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=Update&id=${transforms.id}">
    <table align="center"><h1>修改人才信息</h1></table>
    <table align="center">
        <tr align="center">
            <td>人才姓名:</td>
            <td><input type="text" name="RenName" value="${transforms.name}" required></td>
        </tr>
        <tr align="center">
            <td>工作年限 :</td>
            <td><input type="text" name="workingLife" value="${transforms.workingLife}" required></td>
        </tr>
        <tr align="center">
            <td>毕业学校:</td>
            <td><input type="text" name="graduateSchool" value="${transforms.graduateSchool}" required></td>
        </tr>
        <tr align="center">
            <td>个人简介:</td>
            <td><input type="text" name="personalProfile" value="${transforms.personalProfile}" required></td>
        </tr>
        <tr align="center">
            <td>工作经历:</td>
            <td><input type="text" name="workExperience" value="${transforms.workExperience}" required></td>
        </tr>
        <tr align="center">
            <td>所属部门:</td>
            <td><input type="text" name="departmentIdName" LIST="departmentIdName" required>
                <datalist id="departmentIdName">
                    <option value="开发">开发</option>
                    <option value="人事">人事</option>
                    <option value="行政">行政</option>
                </datalist>
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
