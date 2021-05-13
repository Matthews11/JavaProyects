<%-- 
    Document   : EliminarTesterBDD
    Created on : 04-14-2021, 12:14:01 AM
    Author     : jared
--%>
<%@ include file="conexion.jsp"%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
  <jsp:useBean id="Tester" scope="request" class="beans.Listado_TesterBean">
            <jsp:setProperty name="Tester" property="*" /> 
            </jsp:useBean>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>  
        <%    //Capturando los datos por medio del request y el metodo getParameter
            int id_Tester =  Integer.parseInt( request.getParameter("id_Tester"));
            
            //Sentencia sql para ingresar datos 
             
            st = conexion.prepareStatement("Delete from Listado_Tester WHERE id_Tester = ?");
            st.setInt(1,id_Tester); 
            st.executeUpdate();
            conexion.close(); 
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
         
            <jsp:setProperty name="Tester" property="*" /> 
            <jsp:setProperty name="Tester" property="id_Tester" value="<%= id_Tester%>" />
           
     
          
        <jsp:forward page="EliminarTester.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
