<%-- 
    Document   : for
    Created on : 04-04-2021, 02:23:23 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h3>Tablas de multiplicar</h3>
            </div>
            <%
                for (int i = 1; i <= 10; i++) {
            %>
            <div  class="panel panel-primary">
                <div class="panel-heading"><%="Tabla del " + i%></div>
                <div class="panel-body">
                    <%
                        for (int j = 1; j <= 10; j++) {
                            out.println("<p>" + i + " x " + j + " = " + (i * j) + "</p>");
                        }//Cerrando el for más interno
                    %>
                </div>
            </div>
            <% }//Cerrando el for más externo
            %>
        </div>

    </body>
</html>
