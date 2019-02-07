<%--
  Created by IntelliJ IDEA.
  User: JH
  Date: 2019/1/31
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>转跳</title>
  </head>
  <body>
  <%response.sendRedirect(request.getContextPath()+"/EnterpriseTalentServlet.do?transfer=findAll");%>
  </body>
</html>
