<%-- 
    Document   : Eliminar
    Created on : 04-07-2021, 04:14:35 PM
    Author     : jared
--%>


<%@ page language="java" import="java.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Elminar Usuario</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="estilo1.css">
    </head>
    
    <body>
        
        
        <div class="container">
             <div class="titulo"> Eliminar Usuarios</div>
            <div class="contenedor">
                <h3>Usuarios</h3>
 
                <form role="form" action="EliminarBDD.jsp" method="POST">
                        <div class="well well-sm"><strong><span class="glyphicon glyphiconasterisk"></span>Ingrese el ID del usuario a Eliminar  </strong></div>
                        <div class="form-group">
                            <br>
                            <br>
                            <label for="nombre">ID:</label>
                                <div class="input-group">
                                    <input type="text" class="info" name="Id_Usuario" id="Id_Usuario" placeholder="Ingresa el  ID" required>
                                    <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                                </div>
                        </div>
                        <br>
                         <input type="submit" class="btn btn-info" value="Eliminar">
<br><br>
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
                 
          
            <!--notese el uso de jsp:include -->
            <jsp:include page="mostrar.jsp" />
        </div>
             <!-- /container --></body>
</html>
