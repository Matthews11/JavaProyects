<%-- 
    Document   : index
    Created on : 04-20-2021, 07:35:07 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
core: <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
xml: <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
fmt: <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
sql: <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <title>Ejemplo JSTL</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                &nbsp;
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">Primer ejemplo con JSTL</div>
                <div class="panel-body">
                    <p>Cadena de caracteres: <strong><c:out value="1+2+3"/></strong></p>
                    <p>Suma de valores: <strong><c:out value="${1+2+3}"/></strong></p>
                </div>
            </div>
        </div>
    </body>
</html>
