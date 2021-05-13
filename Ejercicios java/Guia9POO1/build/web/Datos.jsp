<%-- 
    Document   : Datos
    Created on : 04-12-2021, 11:45:13 AM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <title>Datos personales</title> 
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head> 
    <body> 
        <div class="container">
            <div class="row">
                <h3>Datos personales</h3>
            </div>
            <div class="row">
                <form role="form" name="persona" action="Procesar.jsp" method="POST">
                    <div class="col-md-10">
                        <div class="form-group">
                            <label for="nombre">Ingrese su nombre:</label>
                            <div class="input-group">
                                <input type="text" class="form-control" name="nombre" id="nombre" 
                                       placeholder="Nombre">
                                <span class="input-group-addon"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="apellido1">Ingrese su primer apellido:</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="apellido1" name="apellido1" 
                                       placeholder="Primer Apellido">
                                <span class="input-group-addon"></span> </div>
                        </div>
                        <div class="form-group">
                            <label for="apellido2">Ingrese su segundo apellido:</label>
                            <div class="input-group">
                                <input type="text" class="form-control" id="apellido2" name="apellido2" 
                                       placeholder="Segundo Apellido">
                                <span class="input-group-addon"></span>
                            </div>
                        </div>
                        <input type="submit" class="btn btn-info" value="Enviar">
                    </div>
                </form>
            </div>
        </div>
    </body> 
</html>
