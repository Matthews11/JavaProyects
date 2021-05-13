<%-- 
    Document   : set1
    Created on : 04-20-2021, 07:50:15 PM
    Author     : jared
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="variableDePagina" scope="page">
    Esta informaci�n se guarda en la p�gina
</c:set>
<c:set var="variableDeSesion" scope="session">
    Esta informaci�n se guarda en la sesi�n
</c:set>
<c:set var="variableDeAplicacion" scope="application">
    Esta informaci�n se guarda en la aplicaci�n
</c:set> <%-- graba la variable cuatro=4 en el �mbito page --%>
<c:set var="cuatro" value="El valor de esta varialbe es: ${2 + 2}" scope="application"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <title>Etiquetas JSTL</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                &nbsp; 
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">Uso de etiqueta c:set</div>
                <div class="panel-body">
                    <p>${variableDePagina}</p>
                    <p>${variableDeSesion}</p>
                    <p>${variableDeAplicacion}</p>
                    <p>${cuatro}</p>
                </div>
            </div>
            <a href="verambito.jsp">Ir a ver pagina ambito de aplicaci�n</a>
        </div>
    </body>
</html>