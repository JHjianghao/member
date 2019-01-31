<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/1/18
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--<a href="<%=request.getContextPath()%>/member.do?name=findAll">欢迎</a>--%>
  <%response.sendRedirect(request.getContextPath()+"/member.do?names=findAll");%>
  </body>
</html>
