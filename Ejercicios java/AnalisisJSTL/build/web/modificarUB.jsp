<%-- 
    Document   : modificarUB
    Created on : 04-21-2021, 10:24:08 AM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>modificar USUARIOS</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
          <link rel="stylesheet" href="estilo1.css">
       <link rel="stylesheet" href="estilo.css">
    
    </head>
    <body>
        <title>modificar USUARIOS</title>
        <div class="contenedor">
            <div class="row">
                <h3>Usuarios</h3></div>
            <div class="row col-md-5">
                <form role="form" action="modificarUBB.jsp" method="POST">
                    <div class="col-md-10">
                        <div class="well well-sm"><strong><span class="glyphicon glyphiconasterisk"></span>Campos requeridos</strong></div>
             
                   
                        
                                <input type="hidden" class="info" id="idUsuario" name="idUsuario" placeholder="Ingresa  el Nombre" >
                             
                        
                        
                        
                        <div class="form-group">
                             <br>
                            <label for="apellido">Nombre:</label>
                             <br>
                            <div class="input-group">
                                <input type="text" class="info" id="Nombre" name="Nombre" placeholder="Ingresa  el Nombre" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                         <div class="form-group">
                             <br>
                            <label for="apellido">Tipo usuario</label>
                             <br>
                            <div class="input-group">
                                <input type="text" class="info" id="idtipo" name="idtipo" placeholder="Ingresa  el Nombre" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                        
                        <div class="form-group">
                             <br>
                            <label for="telefono">Contraseña</label>
                             <br>
                            <div class="input-group">
                                <input type="password" class="info" id="Contrasena" name="Contrasena" placeholder="Ingresa el contrasena" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                        <input type="submit" class="btn btn-info" value="Ingresar">
                    </div>
                </form>
             
            </div>
            <!--notese el uso de jsp:include -->
            <jsp:include page="mostrarUB.jsp" />
        </div>
             <!-- /container --></body>
</html>