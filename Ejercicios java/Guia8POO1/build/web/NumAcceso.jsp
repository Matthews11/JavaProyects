<%-- 
    Document   : NumAcceso
    Created on : 04-04-2021, 02:25:03 PM
    Author     : jared
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!int numeroAccesos = 0;
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    java.util.Date primerAcceso = new java.util.Date();

    private Date ahora() {
        Date now = new Date();
        return now;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h3>Accesos a la pagina</h3>
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">Información del acceso</div>
                <div class="panel-body">
                    <p>
                        <%="La página ha sido accedida " + (++numeroAccesos)
        + " veces desde el arranque del servidor"%>
                    </p>
                    <p>
                        <%="El primer acceso a la página se realizó el dia "
        + formatoFecha.format(primerAcceso) + " a las "
        + formatoHora.format(primerAcceso)%>
                    </p>
                    <p>
                        <%="El ultimo acceso fue el " + formatoFecha.format(ahora())
        + " a las " + formatoHora.format(ahora())%>
                    </p>
                </div>
            </div>
        </div>
    </body>
</html>
