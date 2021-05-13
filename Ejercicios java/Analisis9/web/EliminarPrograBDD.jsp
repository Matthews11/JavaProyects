<%-- 
    Document   : EliminarPrograBDD
    Created on : 04-14-2021, 07:51:40 PM
    Author     : jared
--%>

<%@ include file="conexion.jsp"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
  <jsp:useBean id="progra" scope="request" class="beans.Listado_ProgramadorBean">
            <jsp:setProperty name="progra" property="*" /> 
            </jsp:useBean>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>  
        <%    //Capturando los datos por medio del request y el metodo getParameter
            int Id_Progra =  Integer.parseInt( request.getParameter("Id_Progra"));
            
            //Sentencia sql para ingresar datos 
             
            st = conexion.prepareStatement("Delete from Listado_Programador WHERE Id_Progra = ?");
            st.setInt(1,Id_Progra); 
            st.executeUpdate();
            conexion.close(); 
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
         
            <jsp:setProperty name="progra" property="*" /> 
            <jsp:setProperty name="progra" property="id_Progra" value="<%= Id_Progra%>" />
           
     
          
        <jsp:forward page="EliminarProgra.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
