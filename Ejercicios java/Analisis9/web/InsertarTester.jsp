<%-- 
    Document   : InsertarTester
    Created on : 04-13-2021, 02:17:22 PM
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
             String Nombre =request.getParameter("Nombre");
             String Apellido= request.getParameter("Apellido");
             int Edad =Integer.parseInt( request.getParameter("Edad"));
             String Correo=request.getParameter("Correo");
          %>
       
            <jsp:setProperty name="Tester" property="nombre" value="<%= Nombre%>" />
            <jsp:setProperty name="Tester" property="apellido" value="<%= Apellido%>" />
            <jsp:setProperty name="Tester" property="edad" value="<%= Edad%>" />
            <jsp:setProperty name="Tester" property="correo" value="<%= Correo%>" />
 
   
      
         <%
            st = conexion.prepareStatement("insert into Listado_Tester (Nombre,Apellido,Edad,Correo) values  (?,?,?,?)");
            st.setString(1,Nombre);
            st.setString(2,Apellido);
            st.setInt(3,Edad);
            st.setString(4,Correo);
            st.executeUpdate();
            conexion.close();
        %>
        
    
            <script type="text/javascript"> alert("Datos ingresados correctamente!");</script>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="FormularioTester.jsp">
        
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>
   