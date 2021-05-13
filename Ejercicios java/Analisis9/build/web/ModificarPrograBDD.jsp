<%-- 
    Document   : MostrarPrograBDD
    Created on : 04-14-2021, 07:46:46 PM
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
            int Id_Progra= Integer.parseInt( request.getParameter("Id_Progra"));
             String Nombre =request.getParameter("Nombre");
             String Apellido= request.getParameter("Apellido");
             int Edad =Integer.parseInt( request.getParameter("Edad"));
             String Correo=request.getParameter("Correo");
          %>
        
            <jsp:setProperty name="progra" property="id_Progra" value="<%= Id_Progra%>" />
            <jsp:setProperty name="progra" property="nombre" value="<%= Nombre%>" />
            <jsp:setProperty name="progra" property="apellido" value="<%= Apellido%>" />
            <jsp:setProperty name="progra" property="edad" value="<%= Edad%>" />
            <jsp:setProperty name="progra" property="correo" value="<%= Correo%>" />
 
   
         <%
             Statement  s = conexion.createStatement();
              st = conexion.prepareStatement("Update Listado_Programador SET Nombre=?, Apellido=?, Edad=?, Correo=? WHERE Id_Progra = ?");
            st.setString(1,Nombre);
            st.setString(2,Apellido);
            st.setInt(3,Edad);
            st.setString(4,Correo);
              st.setInt(5,Id_Progra);
            st.executeUpdate();
            conexion.close();
        %>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="ModificarProgra.jsp">
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
