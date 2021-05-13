<%-- 
    Document   : Modificar
    Created on : 04-07-2021, 04:35:52 PM
    Author     : jared
--%>


<%@ page language="java" import="java.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <link rel="stylesheet" href="estilo1.css">
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar Usuarios</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
         <div class="titulo"> Modificar Usuarios</div>
        <div class="contenedor">
            <div class="row">
                <h3>Usuarios</h3></div>
            <div class="row col-md-5">
                <form role="form" action="ModificarBDD.jsp" method="POST">
                    <div class="col-md-10">
                        <div class="well well-sm"><strong><span class="glyphicon glyphiconasterisk"></span>Campos requeridos</strong></div>
                        <div class="form-group">
                            
                            <br>
                            <label for="nombre">ID:</label>
                    <br>
                                <div class="input-group">
                                    <input type="text" value =" " class="info" name="Id_Usuario" id="Id_Usuario" placeholder="Ingresa el  nombre" required>
                                    <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                                </div>
                        </div>
                        <div class="form-group">
<br><br>
                            <label for="apellido">Nombre:</label>
                            <br>
                            <div class="input-group">
                                <input type="text" class="info" id="Nombre_Usuario" name="Nombre_Usuario" placeholder="Ingresa  el apellido" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <br>
                            <label for="telefono">Contraseña:</label>
                            <br>
                            <div class="input-group">
                                <input type="password" class="info" id="Contrasena" name="Contrasena" placeholder="Ingresa el telefono" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                         <div class="form-group">
                             <br>
                            <label for="telefono">Tipo Usuario:</label>
                            <br>
                            <div class="input-group">
                                <input type="text" class="info" id="Tipo_Usuario" name="Tipo_Usuario" placeholder="Ingresa el telefono" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                            <br>
                        <input type="submit" class="btn btn-info" value="Modificar">
                    </div>
                </form>
                <%-- Verificando si la variable resultado esta vacia--%>
                <%if (request.getParameter("resultado") != null) {
                %>
                <div class="alert alert-success col-md-10">
                    <b><%=request.getParameter("resultado")%></b>
                </div>
                <%
                    }
                %> </div>
            <!--notese el uso de jsp:include -->
            <jsp:include page="mostrar.jsp" />
        </div>
             <!-- /container --></body>
</html>