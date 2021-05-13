<%-- 
    Document   : login
    Created on : 04-04-2021, 02:52:43 PM
    Author     : jared
--%>

<%@page session="true" language="java" import="java.util.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio de sesión</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <h2>Inicio de sesión</h2>
                    <%
                        if (request.getParameter("error") != null) {
                    %>
                    <div class="alert alert-danger">
                        <strong>Error!</strong><%=request.getParameter("error")%>
                        <br>
                    </div>
                    <%
                        }//Findelif
                    %>
                    <form action="checklogin.jsp" method="post"><div class="form-group">
                            <label for="usuario">Usuario</label>
                            <input type="text" class="form-control" id="usuario" placeholder="Usuario" name="usuario"
                                   required>
                        </div>
                        <div class="form-group">
                            <label for="clave">Password:</label>
                            <input type="password" class="formcontrol" id="clave" placeholder="Password" name="clave" required>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Iniciar sesión</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

