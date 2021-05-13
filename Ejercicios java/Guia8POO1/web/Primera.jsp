<%-- 
    Document   : index
    Created on : 04-04-2021, 12:20:16 PM
    Author     : jared
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.*"%>
<%!String titulo = "Mi primer ejemplo con JSP";
    String cadena = "Primer ejemplo";
%>
<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<!DOCTYPEhtml>
<html>
    <head>
        <title><%=titulo%></title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.js"></script>
    <script 
    src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
    <%
        //Obteniendo la fecha actual
        Date fechaActual = new Date();
        //Formateando la fecha
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat FormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    %>
    <div class="container">
        <div class="row">
            <h3><%=titulo%></h3>
        </div>
        <div class="panelpanel-primary">
            <div class="panel-heading"><%=cadena%></div>
            <div class="panel-body">
                <p><%="La fecha actual es: " + FormatoFecha.format(fechaActual)%></p>
                <p><%="La hora actual es: " + formatoHora.format(fechaActual)%></p>
                <p><%=" El tamaño de la cadena ‘" + cadena + "’ es:" + cadena.length()%></p>
            </div>
    </div>
    </div>
</body>
</html>