<%-- 
    Document   : eliminar
    Created on : 04-04-2021, 03:17:30 PM
    Author     : jared
--%>

<%@ page language="java" import="java.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>INGRESAR USUARIOS</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h3>Usuarios</h3></div>
            <div class="row col-md-5">
                <form role="form" action="EliminarBDD.jsp" method="POST">
                    <div class="col-md-10">
                        <div class="well well-sm"><strong><span class="glyphicon glyphiconasterisk"></span>Ingrese el ID del usuario a Eliminar  </strong></div>
                        <div class="form-group">
                            <label for="nombre">ID:</label>
                                <div class="input-group">
                                    <input type="text" class="form-control" name="Id_Usuario" id="Id_Usuario" placeholder="Ingresa el  nombre" required>
                                    <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                                </div>
                        </div>
                         <input type="submit" class="btn btn-info" value="Eliminar">

                </form>
                <%-- Verificando si la variable resultado esta vacia--%>
                <%if (request.getParameter("resultado") != null) {
                %>
                <div class="alert alert-success col-md-10">
                    <b><%=request.getParameter("resultado")%></b>
                </div>
                <%
                    }
                %>
                     
            </div>
            <!--notese el uso de jsp:include -->
            <jsp:include page="consulta.jsp" />
        </div>
             <!-- /container --></body>
</html>
