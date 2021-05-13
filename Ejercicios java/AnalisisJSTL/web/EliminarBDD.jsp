<%-- 
    Document   : EliminarBDD
    Created on : 04-21-2021, 08:15:37 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
        <c:set var="idUsuario" value="${param.idUsuario}"/>
        <sql:update var="actualizar" dataSource="jdbc/mysql">
            Delete from usuarios  WHERE Id_Usuario =  ?
            <sql:param value="${idUsuario}"/> 
        </sql:update>
        <script> alert("Datos Eliminados exitosamente");</script> 
        <c:redirect url="eliminarUB.jsp"/>


    </body>
</html>
