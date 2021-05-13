<%-- 
    Document   : Procesar
    Created on : 04-12-2021, 11:47:17 AM
    Author     : jared
--%>

<!DOCTYPE html>
 <%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp"%> 
<jsp:useBean id="codigo" class="sv.edu.udb.guia9.CodigoBean"/> 
<%
    int total_registros = 0;
   Statement  s = conexion.createStatement(); 
    rs = s.executeQuery("select count(*) from empleados");
%> 
<% while (rs.next()) {
        total_registros = rs.getInt(1);
    }%> 
<jsp:setProperty name="codigo" property="apellido1" param="apellido1"/> 
<jsp:setProperty name="codigo" property="apellido2" param="apellido2"/> 
<jsp:setProperty name="codigo" property="cantidad_registros" value="<%=total_registros%>"/>
<html> 
    <head> 
        <title>jsp:useBean</title> 
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head> 
    <body> 
        <div class="container">
            <div class="row">
                &nbsp;
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">Resultado</div>
                <div class="panel-body">
                    <p>Su apellido1 es: <strong><jsp:getProperty name="codigo" 
                                     property="apellido1"/></strong></p> 
                    <p>Su apellido2 es: <strong><jsp:getProperty name="codigo" 
                                     property="apellido2"/></strong></p> 
                    <p>Año: <strong><jsp:getProperty name="codigo" property="fecha"/></strong></p> 
                    <p>Primera Letra: <strong><jsp:getProperty name="codigo" 
                                     property="letra"/></strong></p> 
                    <p>Segunda Letra: <strong><jsp:getProperty name="codigo" 
                                     property="letra2"/></strong></p> 
                    <p>Codigo obtenido: <code><jsp:getProperty name="codigo" 
                                     property="cod"/></code></p> 
                </div>
            </div>
        </div> 
    </body> 
</html>
