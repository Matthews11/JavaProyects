<%-- 
    Document   : modificarV
    Created on : 04-28-2021, 02:39:31 PM
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
            <form action="${pageContext.request.contextPath}/ventas?accion=modificar" target="" method="post" name="formDatosPersonales">

        <input type="hidden" name="id" id="id" value="${param.id}"   />
	 
        <label for="tp">Seleccione el tipos de Linea</label>
                <select   name="tl">
                    <option>${param.lin}</option> 

                    <c:forEach var="tp" items="${qs.rows}"> 

                        <option>${tp.Linea}</option> 
                    </c:forEach> 

                </select> 

	<label for="start">Fecha </label>

	<input type="date" id="start" name="fecha"
    
       min="2021-04-01" max="2022-12-31"  value="${param.fecha}"  placeholder="${param.fecha}"/>

	<label for="mensaje">Descripcion</label>
	<textarea name="mensaje" for="mensaje" value="${param.descripcion}" 
                  placeholder="${param.descripcion}" maxlength="500"></textarea>
	
	<input type="submit" name="enviar" accion ="modificar"value="enviar datos"/>
</form>
        </div> 
                  <li><a href="mostrarV.jsp">atras</a></li>
       
    </body>
</html>