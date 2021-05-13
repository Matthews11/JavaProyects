<%-- 
    Document   : principal
    Created on : 03-13-2021, 11:36:38 AM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession session_actual = request.getSession(false);
    String usuario = (String) session_actual.getAttribute("USER");
    String nombres = (String) session_actual.getAttribute("NAME");
    if (usuario == null) {
        response.sendRedirect("login.html");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>
            Bienvenido: (<%=usuario%>)<%=nombres%>
        </h2>
    </body>
</html>
