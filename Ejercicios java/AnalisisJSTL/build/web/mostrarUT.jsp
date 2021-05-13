<%-- 
    Document   : mostrarUT
    Created on : 04-21-2021, 08:21:06 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="estilo1.css">
       <link rel="stylesheet" href="estilo.css">
    
<sql:query var="q1" dataSource="jdbc/mysql">
    SELECT * from Tipo_Usuario 
</sql:query>
<div class="row col-md-3"></div>
<div class="row col-md-6">
    <table class="table table-striped table-bordered table-hover">
        <thead>
            <tr>

                <th>ID</th>
                <th>Tipo_Usuario</th>

            </tr>
        </thead>
        <tbody>
            <c:forEach var="Usuario" items="${q1.rows}">
                <tr>
                    <td><c:out value="${Usuario.Id_Tipo_Usuario}"/></td>
                    <td><c:out value="${Usuario.Tipo_Usuario}"/></td>

                   <td>      <button class="tn btn-info" onclick="cargarform('${Usuario.Id_Tipo_Usuario}', '${Usuario.Tipo_Usuario}');"  >  Modificar    </button></td>
                    <td>     <button class="tn btn-info" onclick="eliminar('${Usuario.Id_Tipo_Usuario}');"  >  Eliminar    </button></td>

                </tr>

            </c:forEach>
        <a class="le" href='index.jsp'>Atras</a> 
        </tbody>
    </table>
</div>

<script> function cargarform(id, nombre) {

        document.getElementById("Id_Tipo_Usuario").value = id;
        document.getElementById("Tipo_Usuario").value = nombre;
    }

    function eliminar(id) {

        document.getElementById("Id_Tipo_Usuario").value = id;
    }

</script>

