<%-- 
    Document   : FormularioTester
    Created on : 04-13-2021, 02:12:32 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="estilo1.css">
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
        <title>Ingresar Tester</title>
        <div class="titulo"> Ingresar Tester</div>
        <div class="contenedor">
            <div class="row">
                <h3>Usuarios</h3></div>
            <div class="row col-md-5">
                <form role="form" action="InsertarTester.jsp" method="POST">
                    <div class="col-md-10">
                        <div class="well well-sm"><strong><span class="glyphicon glyphiconasterisk"></span>Campos requeridos</strong></div>
             
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
                            <label for="telefono">Apellido:</label>
                             <br>
                            <div class="input-group">
                                <input type="text" class="info" id="Apellido" name="Apellido" placeholder="Ingresa el Apellido" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                         <div class="form-group">
                              <br>
                            <label for="telefono">Edad:</label>
                             <br> 
                            <div class="input-group">
                                <input type="int" class="info" id="Edad" name="Edad" placeholder="Ingresa la Edad" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                         <div class="form-group">
                              <br>
                            <label for="telefono">Correo:</label>
                             <br> 
                            <div class="input-group">
                                <input type="int" class="info" id="Correo" name="Correo" placeholder="Ingresa el Correo" required>
                                <span class="input-group-addon"><span class="glyphicon glyphiconasterisk"></span></span>
                            </div>
                        </div>
                        
                        <input type="submit" class="btn btn-info" value="Ingresar">
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
                %>
                     
            </div>
            <!--notese el uso de jsp:include -->
            <jsp:include page="MostrarTester.jsp" />
        </div>
             <!-- /container --></body>
</html>