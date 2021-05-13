<%-- 
    Document   : IngresarV
    Created on : 04-28-2021, 02:54:18 PM
    Author     : jared
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CRUD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilo1.css">
        <link rel="stylesheet" href="estilo.css"> 

        <sql:query var="qs" dataSource="jdbc/mysql">
            SELECT * from lineas_de_venta;  
        </sql:query>
    </head>
    <body>
        <div class="titulo"> Mantenimiento a Ventas</div>

        <div> 
            <form action="${pageContext.request.contextPath}/ventas?accion=ingresar" target="" method="post" name="formDatosPersonales">



                <label for="tl">Seleccione el tipos de Linea</label>
                <select   name="tl"> 
                    <c:forEach var="tp" items="${qs.rows}"> 

                        <option>${tp.Linea}</option> 
                    </c:forEach> 

                </select> 
                <br><br><br><br>

                <label for="start">Fecha de Caso</label>

                <input type="date" id="start" name="fecha"
                       value="2021-01-01"
                       min="2021-04-01" max="2022-12-31"  >
                <br>
                <br><br><br>
                <label for="mensaje">Descripcion</label>
                <textarea name="mensaje" for="mensaje"   
                          placeholder="describe brevemente en menos de 500 carácteres" maxlength="500"></textarea>
                <br>
                <input type="submit" name="enviar" accion ="ingresar"value="enviar datos"/>
                <li><a href="index.jsp">atras</a></li>  
            </form>
        </div> 

    </body>
</html>