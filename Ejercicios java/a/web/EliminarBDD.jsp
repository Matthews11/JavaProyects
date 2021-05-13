<%-- 
    Document   : EliminarBDD
    Created on : 04-07-2021, 08:07:17 PM
    Author     : jared
--%>

<%@ include file="conexion.jsp"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>  
        <%    //Capturando los datos por medio del request y el metodo getParameter
            int Id_Usuario =  Integer.parseInt( request.getParameter("Id_Usuario"));
            
            //Sentencia sql para ingresar datos 
            
             Statement  s = conexion.createStatement();
            s.executeUpdate("Delete from Usuarios  WHERE Id_Usuario = '"+Id_Usuario+"'");
            conexion.close();
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="Eliminar.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
