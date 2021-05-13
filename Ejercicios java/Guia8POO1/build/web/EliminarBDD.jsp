<%-- 
    Document   : EliminarBDD
    Created on : 04-07-2021, 08:20:18 PM
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
            int codigo =  Integer.parseInt( request.getParameter("Id_Usuario"));
            
            //Sentencia sql para ingresar datos 
            
             Statement  s = conexion.createStatement();
            s.executeUpdate("Delete from Empleados  WHERE codigo = '"+codigo+"'");
            conexion.close();
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="eliminar.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>

