<%-- 
    Document   : checklogin
    Created on : 04-04-2021, 02:55:17 PM
    Author     : jared
--%>

<%@page session="true" language="java" import="java.util.*" %>
<%@ page import="sv.edu.udb.Conexion, java.sql.*" %>
<%
    String usuario = request.getParameter("usuario");
    String clave = request.getParameter("clave");
    Conexion con = new Conexion();
//buscar� una coincidencia (count usuario), si es correcto
    //podr� loguearse
    con.setRs("select count(usuario),nombres from usuarios"
            + " where usuario='" + usuario + "' and "
            + "password=SHA2('" + clave + "',256)");
//Se esta usando SHA2 con claves de 256 bits
    ResultSet rs = con.getRs();
    rs.next();
    if (rs.getInt(1) == 1) { //solo una coincidencia es permitida 
//si se puede loguear, hay que evitar que quede una conexi�n
        //activa
        rs.close();
        con.cerrarConexion();
//se asignan los par�metros de sesi�n
        HttpSession sesionOk = request.getSession();
        sesionOk.setAttribute("usuario", usuario);
%>
<jsp:forward page="menu.jsp" />
<%
} else {
%>
<jsp:forward page="login.jsp">
    <jsp:param name="error" value="Usuario y/o clave
               Incorrecto. Vuelve a intentarlo."/>
</jsp:forward>
<%
    }
    rs.close();
    con.cerrarConexion();
%>
