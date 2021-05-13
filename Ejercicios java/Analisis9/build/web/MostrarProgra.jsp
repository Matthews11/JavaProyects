<%-- 
    Document   : MostrarProgra
    Created on : 04-14-2021, 07:41:19 PM
    Author     : jared
--%>

<%@ include file="conexion.jsp"%>
   
                  
<link rel="stylesheet" href="estilo1.css">
<title>Mostrar  Usuarios</title>
           <jsp:useBean id="progra" scope="request" class="beans.Listado_ProgramadorBean">
                     <jsp:setProperty name="Tester" property="*" /> 
                      </jsp:useBean>
<div class="contenedor">

    <div class="aaa">
        <table >
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombres</th>
                    <th>Apellido</th>
                    <th>Edad</th>
                    <th>Correo</th>
                </tr>
            </thead>
            <tbody>
                <%    st = conexion.prepareStatement("select * from Listado_Programador");
                    rs = st.executeQuery();
                    while (rs.next()) {
                %>
                <tr>
                     
                    
                    <td><%=rs.getInt("Id_Progra")%></td>
                    <td><%=rs.getString("Nombre")%></td>
                    <td><%=rs.getString("Apellido")%></td>
                    <td><%=rs.getInt("Edad")%></td>
                    <td><%=rs.getString("Correo")%></td>
       
                     <jsp:setProperty name="progra" property="id_Progra"  value='<%=rs.getInt("Id_Progra")%>'/>
                     <jsp:setProperty name="progra" property="nombre" value='<%=rs.getString("Nombre")%>' />
                     <jsp:setProperty name="progra" property="apellido" value='<%=rs.getString("Apellido")%>' />
                     <jsp:setProperty name="progra" property="edad" value='<%=rs.getInt("Edad")%>' />
                     <jsp:setProperty name="progra" property="correo" value='<%=rs.getString("Correo")%>' />
                  
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
    <%   conexion.close();%>
</div>
