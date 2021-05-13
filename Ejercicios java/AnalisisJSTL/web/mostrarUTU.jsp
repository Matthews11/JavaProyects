<%-- 
    Document   : mostrarUTU
    Created on : 04-21-2021, 08:36:37 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
      <link rel="stylesheet" href="css/bootstrap.min.css">
         <link rel="stylesheet" href="estilo1.css">
       <link rel="stylesheet" href="estilo.css">
    
        <sql:query var="q1" dataSource="jdbc/mysql">
            SELECT u.Nombre_Usuario, u.Contrasena, TU.Tipo_Usuario  from Usuarios u  inner join Tipo_Usuario TU on
            u.IdTipoUsuario=TU.Id_Tipo_Usuario;
        </sql:query>
        <div class="row col-md-3"></div>
        <div class="contenedor">
            <table class="table table-striped table-bordered table-hover">
                <thead>
                    <tr>

                          <th>Nombres</th>
                        <th>Tipo_Usuario</th>
                          <th>Contrasena</th>
                     
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="Usuario" items="${q1.rows}">
                        <tr>
                            <td><c:out value="${Usuario.Nombre_Usuario}"/></td>
                            <td><c:out value="${Usuario.Tipo_Usuario}"/></td> 
                            <td><c:out value="${Usuario.Contrasena}"/></td>
                        </tr> 
                    </c:forEach>
               <a class="le" href='index.jsp'>Atras</a> 
                </tbody>
            </table>
        </div>