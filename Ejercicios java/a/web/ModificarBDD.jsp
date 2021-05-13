<%-- 
    Document   : Modificar
    Created on : 04-07-2021, 04:14:16 PM
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
            String Nombre_Usuario = request.getParameter("Nombre_Usuario");
            String Contrasena = request.getParameter("Contrasena");
            int Tipo_Usuario = Integer.parseInt( request.getParameter("Tipo_Usuario"));
            //Sentencia sql para ingresar datos 
            
             Statement  s = conexion.createStatement();
            s.executeUpdate("Update Usuarios SET "+" Nombre_Usuario='"+Nombre_Usuario+"',"+"Contraseña='"+Contrasena+"',"+"Tipo_Usuario='"+Tipo_Usuario+"'"+ " WHERE Id_Usuario = '"+Id_Usuario+"'");
            conexion.close();
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="Modificar.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
