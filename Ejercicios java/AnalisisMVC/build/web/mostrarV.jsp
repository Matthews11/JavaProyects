<%-- 
    Document   : mostrarV
    Created on : 04-28-2021, 02:39:03 PM
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
                SELECT  v.id_venta,v.fecha_venta,v.descripcion, lv.Linea from ventas v
                inner join lineas_de_venta lv on v.id_linea = lv.id_linea; 

            </sql:query>
    </head>
    <body>
        <div class="titulo"> Mantenimiento a Ventas</div>

               
            <div class="row col-md-3"></div>
            <div class="contenedor">
                <table class="table table-striped table-bordered table-hover">
                    <thead>
                        <tr>

                            <th>Linea</th>
                            <th>Fecha</th>
                            <th>Descripcion</th>


                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="v" items="${qs.rows}">
                            <tr>
                                <td><c:out value="${v.Linea}"/></td> 
                                <td><c:out value="${v.fecha_venta}"/></td> 
                                <td><c:out value="${v.descripcion}"/></td> 

                                
                                <td>   <a class="le" href='modificarV.jsp?id=${v.id_venta}&fecha=${v.fecha_venta}&descripcion=${v.descripcion}&lin=${v.Linea}'>Modificar</a> </td> 
                                <td>   <a class="le" href='eliminarV.jsp?id=${v.id_venta}&fecha=${v.fecha_venta}&descripcion=${v.descripcion}&lin=${v.Linea} '>Eliminar</a> </td> 
                            </tr> 
                        </c:forEach>
                    </tbody>
                </table>
            </div>



       
    </body>
</html>
