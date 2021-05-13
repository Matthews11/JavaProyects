<%-- 
    Document   : eliminarUTT
    Created on : 04-21-2021, 08:31:43 PM
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
 
        <c:set var="Id_Tipo_Usuario" value="${param.Id_Tipo_Usuario}"/>
        <sql:update var="actualizar" dataSource="jdbc/mysql">
            Delete from Tipo_Usuario  WHERE Id_Tipo_Usuario =  ?
            <sql:param value="${Id_Tipo_Usuario}"/> 
        </sql:update>
        <script> alert("Datos Actualizados exitosamente");</script> 
        <c:redirect url="eliminarUT.jsp"/>


    </body>
</html>