<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/4
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
<form align="center" method="post" action="<%=request.getContextPath()%>/EnterpriseTalentServlet.do?transfer=Add">
    <table align="center"><h1>添加人才信息</h1></table>
    <table align="center">
        <tr align="center">
            <td>人才姓名:</td>
            <td><input type="text" name="RenName" required></td>
        </tr>
        <tr align="center">
            <td>工作年限 :</td>
            <td><input type="text" name="workingLife" required></td>
        </tr>
        <tr align="center">
            <td>所属部门:</td>
            <td><input type="text" name="departmentIdName" list="departmentIdName" required>
                <datalist id="departmentIdName">
                    <option value="开发">开发</option>
                    <option value="人事">人事</option>
                    <option value="行政">行政</option>
                </datalist>
            </td>
        </tr>
        <tr align="center">
            <td>毕业学校:</td>
            <td><input type="text" name="graduateSchool" required></td>
        </tr>
        <tr align="center">
            <td>个人简介:</td>
            <td><input type="text" name="personalProfile" required></td>
        </tr>
        <tr align="center">
            <td>工作经历:</td>
            <td><input type="text" name="workExperience" required></td>
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
