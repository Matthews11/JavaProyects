<%-- 
    Document   : internacionalizacion
    Created on : 04-20-2021, 08:35:13 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/tabla1.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <h2><fmt:message key="label.datos"/></h2>
        <form name="persona" action="ProcesarInfo.jsp" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td><fmt:message key="label.nombre"/></td>
                        <td><input type="text" name="nombre" value="" /></td>
                    </tr>
                    <tr class="odd">
                        <td><fmt:message key="label.apellido1"/></td>
                        <td><input type="text" name="apellido1" value="" /></td>
                    </tr>
                    <tr>
                        <td><fmt:message key="label.apellido2"/></td>
                        <td><input type="text" name="apellido2" value="" /></td>
                    </tr>
                    <tr class="odd">
                        <td><fmt:message key="label.edad"/></td>
                        <td><input type="text" name="edad" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="<fmt:message key="label.ingresar"/>"></td>
                    </tr>
                </tbody>
            </table>
        </form>
        <br/>
    <center><jsp:useBean id="now" class="java.util.Date" />
        <fmt:formatDate value="${now}" pattern="dd 'de' MMMM 'de' yyyy, hh:mm a." />
    </center>
</body>
</html>