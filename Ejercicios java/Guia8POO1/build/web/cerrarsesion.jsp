<%-- 
    Document   : cerrarsesion
    Created on : 04-04-2021, 03:00:54 PM
    Author     : jared
--%>

<%@ page session="true" %>
<%
 HttpSession sesionOk = request.getSession();
 sesionOk.invalidate();
%>
<jsp:forward page="login.jsp"/>
