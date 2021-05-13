<%-- 
    Document   : eliminarV
    Created on : 04-28-2021, 02:39:42 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CRUD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilo1.css">
        <link rel="stylesheet" href="estilo.css">

    </head>
    <body>
        <div class="titulo"> Mantenimiento a Ventas</div>

        <div> 
            <form action="${pageContext.request.contextPath}/ventas?accion=eliminar" target="" method="POST" name="formDatosPersonales">

                <input type="hidden" name="id" id="id" value="${param.id}"   />

                <label for="tp">Seleccione el tipos de Linea</label>
                <select  readonly="readonly" name="tl">
                    <option>${param.lin}</option> 

                </select> 

                <label for="start">Fecha </label>

                <input readonly="readonly" type="date" id="start" name="fecha"

                       min="2021-04-01" max="2022-12-31"  value="${param.fecha}" />

                <label for="mensaje">Descripcion</label>
                <textarea name="mensaje" for="mensaje" value="${param.descripcion}" 
                          readonly="readonly"    placeholder="${param.descripcion}" maxlength="500"></textarea>

                <input type="submit" name="enviar" accion ="eliminar" value="Eliminar"/>
            </form>
        </div> 
 <li><a href="mostrarV.jsp">atras</a></li>
    </body>
</html>