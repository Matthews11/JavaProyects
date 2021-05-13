 <%-- 
    Document   : index
    Created on : 04-06-2021, 03:56:13 PM
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
            st = conexion.prepareStatement("INSERT INTO Usuarios values (?,?,?,?)");
            st.setInt(1, Id_Usuario);
            st.setString(2, Nombre_Usuario);
            st.setString(3, Contrasena);
            st.setInt(4, Tipo_Usuario);
            st.executeUpdate();
            conexion.close();
        %>
            <script type="text/javascript"> alert("Datos ingresados correctamente!");</script>
        <%--Forward que se utiliza para redireccionar a la pagina de ingresaremp.jsp--%>
        <jsp:forward page="ingresar.jsp">
        
            <jsp:param name="resultado" value="Datos Ingresados Exitosamente"/>
        </jsp:forward>
    </body>
</html>