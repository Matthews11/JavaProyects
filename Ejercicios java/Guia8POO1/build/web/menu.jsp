<%-- 
    Document   : menu
    Created on : 04-04-2021, 02:57:36 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
    String usuario = "";
    HttpSession sesionOk = request.getSession();
    if (sesionOk.getAttribute("usuario") == null) {
%>
<jsp:forward page="login.jsp">
    <jsp:param name="error" value="Es obligatorio identificarse"/>
</jsp:forward>
<%
    } else {
        usuario = (String) sesionOk.getAttribute("usuario");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu principal</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed"
                            data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Desplegar navegación</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Ejemplo POO</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Inicio</a></li>
                        <li><a href="ingresaremp.jsp">Empleados</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                               aria-expanded="false">Usuarios <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="opc1.jsp">Crear usuario</a></li>
                                <li><a href="opc2.jsp">Borrar usuario</a></li>
                                <li><a href="opc3.jsp">Cambiar clave</a></li>
                            </ul>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="cerrarsesion.jsp">
                                <%=usuario%> (cerrar sesión)</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h3>PROCESO DE IDENTIFICACIÓN</h3>
            <p>
            <h5>Menú de administración</h5>
            <b>Usuario activo:</b><%=usuario%>
        
    </div>
</body>
</html>
