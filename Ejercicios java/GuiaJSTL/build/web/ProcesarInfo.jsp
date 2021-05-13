<%-- 
    Document   : ProcesarInfo
    Created on : 04-20-2021, 08:14:26 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<jsp:useBean id="cod" scope="page" class="sv.edu.udb.guia10.CodigoBean"/>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <title>Datos JSTL</title>
    </head>
    <body>
    <c:set var="nombre" value="${param.nombre}"/>
    <c:set var="apellido1" value="${param.apellido1}"/>
    <c:set var="apellido2" value="${param.apellido2}"/>
    <c:set var="edad" value="${param.edad}"/>
    
    <sql:query var="q1" dataSource="jdbc/mysql">
        SELECT * from empleados
    </sql:query>
        
    <c:set var="nreg" value="${q1.rowCount}"/>
    <c:set target="${cod}" property="apellido1" value="${apellido1}"/>
    <c:set target="${cod}" property="apellido2" value="${apellido2}"/>
    <c:set target="${cod}" property="cantidad_registros" value="${nreg}"/>
    <c:set var="codigoUsu" value="${cod.cod}"/>
    <div class="container">
        <div class="row">&nbsp;</div>
        <div class="panel panel-primary">
            <div class="panel-heading">Datos recibidos</div>
            <div class="panel-body">
                <p>Nombre: <strong><c:out value="${nombre} " /></strong></p>
                <p>Primer apellido: <strong><c:out value="${apellido1} " /></strong></p>
                <p>Segundo apellido: <strong><c:out value="${apellido2} " /></strong></p>
                <p>Edad: <strong><c:out value="${edad} " /></strong></p>
                <p>Codigo: <strong><c:out value="${codigoUsu} " /></strong></p>
            </div>
        </div>
    </div>
    <sql:update var="insertar" dataSource="jdbc/mysql">
        insert into empleados (id,nombres,apellido1,apellido2,edad) values (?,?,?,?,?)
        <sql:param value="${codigoUsu}"/>
        <sql:param value="${nombre}"/>
        <sql:param value="${apellido1}"/>
        <sql:param value="${apellido2}"/>
        <sql:param value="${edad}"/>
    </sql:update>
    <sql:query var="q1" dataSource="jdbc/mysql">
        SELECT * from empleados
    </sql:query>
    <div class="row col-md-3"></div>
    <div class="row col-md-6">
        <table class="table table-striped table-bordered table-hover">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombres</th>
                    <th>Apellidos</th>
                    <th>Edad</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="name" items="${q1.rows}">
                <tr>
                <td><c:out value="${name.id}"/></td>
                <td><c:out value="${name.nombres}"/></td>
                <td><c:out value="${name.apellido1} ${name.apellido2}"/></td>
                <td><c:out value="${name.edad}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="row col-md-3"></div>
</body>
</html>
