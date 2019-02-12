<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/2/11
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%response.sendRedirect(request.getContextPath()+"/News_detailServlet.do?transfer=findAll");%>
  </body>
</html>
