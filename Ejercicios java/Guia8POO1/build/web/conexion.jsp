<%-- 
    Document   : conexion
    Created on : 04-04-2021, 02:36:24 PM
    Author     : jared
--%>

 <%@ page language="java" import="java.sql.*" %>
<%
 Connection conexion = null;
PreparedStatement st = null;ResultSet rs = null;
//Leemos el driver de Mysql
Class.forName("com.mysql.jdbc.Driver");
// Se obtiene una conexi�n con la base de datos.
conexion = DriverManager.getConnection(
"jdbc:mysql://localhost:6666/Guia8_POO1", "root", "12345");
%>
