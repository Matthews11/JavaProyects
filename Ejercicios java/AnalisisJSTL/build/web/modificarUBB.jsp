<%-- 
    Document   : modificarUBB
    Created on : 04-21-2021, 02:35:53 PM
    Author     : jared
--%>

<%-- 
    Document   : modificarUBB
    Created on : 04-21-2021, 02:35:53 PM
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

        <c:set var="id" value="${param.idUsuario}"/>
        <c:set var="nombre" value="${param.Nombre}"/>
        <c:set var="idtipo" value="${param.idtipo}"/>
        <c:set var="contrasena" value="${param.Contrasena}"/>


        <c:if test="${not empty param.idUsuario}">

         

            <sql:update var="actualizar" dataSource="jdbc/mysql">
                Update usuarios SET Nombre_Usuario=?, IdTipoUsuario=?, Contrasena=?  WHERE Id_Usuario = ?
                <sql:param value="${nombre}"/>
                <sql:param value="${idtipo}"/> 
                <sql:param value="${contrasena}"/>  
                <sql:param value="${id}"/> 
            </sql:update>
                   <script> alert("Datos Actualizados exitosamente");</script> 
                 <c:redirect url="modificarUB.jsp"/>
        </c:if>
  
    </body>
</html>