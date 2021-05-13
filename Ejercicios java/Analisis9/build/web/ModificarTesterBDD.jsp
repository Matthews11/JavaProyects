<%-- 
    Document   : ModificarTesterBDD
    Created on : 04-14-2021, 12:02:45 AM
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
            int id_Tester= Integer.parseInt( request.getParameter("id_Tester"));
             String Nombre =request.getParameter("Nombre");
             String Apellido= request.getParameter("Apellido");
             int Edad =Integer.parseInt( request.getParameter("Edad"));
             String Correo=request.getParameter("Correo");
          %>
        
            <jsp:setProperty name="Tester" property="id_Tester" value="<%= id_Tester%>" />
            <jsp:setProperty name="Tester" property="nombre" value="<%= Nombre%>" />
            <jsp:setProperty name="Tester" property="apellido" value="<%= Apellido%>" />
            <jsp:setProperty name="Tester" property="edad" value="<%= Edad%>" />
            <jsp:setProperty name="Tester" property="correo" value="<%= Correo%>" />
 
   
         <%
             Statement  s = conexion.createStatement();
              st = conexion.prepareStatement("Update Listado_Tester SET Nombre=?, Apellido=?, Edad=?, Correo=? WHERE id_Tester = ?");
            st.setString(1,Nombre);
            st.setString(2,Apellido);
            st.setInt(3,Edad);
            st.setString(4,Correo);
              st.setInt(5,id_Tester);
            st.executeUpdate();
            conexion.close();
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="ModificarTester.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
