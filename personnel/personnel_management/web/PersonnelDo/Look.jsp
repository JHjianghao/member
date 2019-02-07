<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/4
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
 String Id = request.getParameter("Id");
response.sendRedirect(request.getContextPath()+"/EnterpriseTalentServlet.do?transfer=LookId"+Id);%>
</body>
</html>
