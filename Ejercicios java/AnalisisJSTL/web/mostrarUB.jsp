<%-- 
    Document   : mostrarUB
    Created on : 04-21-2021, 09:22:07 AM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
  <link rel="stylesheet" href="estilo1.css">
       <link rel="stylesheet" href="estilo.css">
    
<sql:query var="q1" dataSource="jdbc/mysql">
    SELECT * from Usuarios 
</sql:query>
<div class="row col-md-3"></div>
<div class="row col-md-6">
    <table class="table table-striped table-bordered table-hover">
        <thead>
            <tr>

                <th>Nombres</th>
                <th>Tipo_Usuario</th>
                <th>Contraseña</th>
                <th>Operaciones</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="Usuario" items="${q1.rows}">
                <tr>
                    <td><c:out value="${Usuario.Nombre_Usuario}"/></td>
                    <td><c:out value="${Usuario.IdTipoUsuario}"/></td>
                    <td><c:out value="${Usuario.Contrasena}"/></td>

                    <td> <button class="btn btn-info" onclick="cargarform('${Usuario.Id_Usuario}', '${Usuario.Nombre_Usuario}', '${Usuario.IdTipoUsuario}', '${Usuario.Contrasena}');"  >  Modificar    </button></td>
                    <td>     <button class="tn btn-info" onclick="eliminar('${Usuario.Id_Usuario}');"  >  Eliminar    </button></td>
                </tr>

            </c:forEach>
        <a class="le" href='index.jsp'>Atras</a> 
        </tbody>
    </table>
</div>

<script> function cargarform(id, nombre, idtipo, Contrasena) {

        document.getElementById("idUsuario").value = id;
        document.getElementById("Nombre").value = nombre;
        document.getElementById("idtipo").value = idtipo;
        document.getElementById("Contrasena").value = Contrasena;


    }
    function eliminar(id) {

        document.getElementById("idUsuario").value = id;
    }

</script>


