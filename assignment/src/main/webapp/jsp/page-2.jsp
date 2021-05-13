<%--
  Created by IntelliJ IDEA.
  User: w2
  Date: 12.09.2020
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp"%>
<%

    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String phone = request.getParameter("phone");
%>
<h1>Hello, <%=name%>!</h1>
<%=application.getInitParameter("IDE")%>
<%--<form action="BasicServlet" method="post">--%>
<%--    Input firstname of the player--%>
<%--    <input type="text" name="fname">--%>
<%--    <br>--%>
<%--    Input lastname of the player--%>
<%--    <input type="text" name="lname">--%>
<%--&lt;%&ndash;    <input type="submit" value="find" name="conf">&ndash;%&gt;--%>
<%--</form>--%>
<form method="post" action="basicServlet">
    <input type="submit">
</form>
<%--<% String x = request.getParameter("conf");--%>
<%--if(x!=null && x.equals("forwards")) {--%>
<%--    RequestDispatcher dispatcher = request.getRequestDispatcher("BasicServlet");--%>
<%--    dispatcher.forward(request,response);--%>
<%--//    response.sendRedirect("/basicServlet");--%>
<%--}--%>
<%--%>--%>
<h2><%=application.getInitParameter("IDE")%>></h2>
<%@include file="footer.jsp"%>
</body>
</html>
