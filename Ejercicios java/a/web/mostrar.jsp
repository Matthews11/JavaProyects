 <%-- 
    Document   : index
    Created on : 04-06-2021, 03:56:13 PM
    Author     : jared
--%>
<%@ include file="conexion.jsp"%>
<link rel="stylesheet" href="estilo1.css">
<title>Mostrar  Usuarios</title>

<div class="contenedor">
    
    <div class="aaa">
    <table >
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombres</th>
                <th>Contraseña</th>
                <th>Tipo Usuario</th>
                 
            </tr>
        </thead>
        <tbody>
            <%    st = conexion.prepareStatement("select * from Usuarios");
                rs = st.executeQuery();
                while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("Id_Usuario")%></td>
                <td><%=rs.getString("Nombre_Usuario")%></td>
                <td><%=rs.getString("Contraseña")%></td>
                <td><%=rs.getString("Tipo_Usuario")%></td>
               
        
             
                    </tr>
            <%
                }
 %>
        <br>
       


           
        </tbody>
    </table>
        </div> 
 <br><br>
         <a class="le" href='index.jsp'>Atras</a> 
             <%   conexion.close(); %>
             </div>