<%-- 
    Document   : modificarUTT
    Created on : 04-21-2021, 08:24:38 PM
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

        <c:set var="id" value="${param.Id_Tipo_Usuario}"/>
        <c:set var="nombre" value="${param.Tipo_Usuario}"/>
     

        <c:if test="${not empty param.Id_Tipo_Usuario}">

         

            <sql:update var="actualizar" dataSource="jdbc/mysql">
                Update tipo_usuario SET Tipo_Usuario=?  WHERE Id_Tipo_Usuario = ?
                <sql:param value="${nombre}"/> 
                <sql:param value="${id}"/> 
            </sql:update>
                   <script> alert("Datos Actualizados exitosamente");</script> 
                 <c:redirect url="modificarUT.jsp"/>
        </c:if>
  
    </body>
</html>