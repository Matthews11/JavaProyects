<%-- 
    Document   : MostrarTester
    Created on : 04-13-2021, 02:16:40 PM
    Author     : jared
--%>

<%@ include file="conexion.jsp"%>
   
                  
<link rel="stylesheet" href="estilo1.css">
<title>Mostrar  Usuarios</title>
           <jsp:useBean id="Tester" scope="request" class="beans.Listado_TesterBean">
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
                <%    st = conexion.prepareStatement("select * from Listado_Tester");
                    rs = st.executeQuery();
                    while (rs.next()) {
                %>
                <tr>
                     
                    
                    <td><%=rs.getInt("id_Tester")%></td>
                    <td><%=rs.getString("Nombre")%></td>
                    <td><%=rs.getString("Apellido")%></td>
                    <td><%=rs.getInt("Edad")%></td>
                    <td><%=rs.getString("Correo")%></td>
       
                     <jsp:setProperty name="Tester" property="id_Tester"  value='<%=rs.getInt("id_Tester")%>'/>
                     <jsp:setProperty name="Tester" property="nombre" value='<%=rs.getString("Nombre")%>' />
                     <jsp:setProperty name="Tester" property="apellido" value='<%=rs.getString("Apellido")%>' />
                     <jsp:setProperty name="Tester" property="edad" value='<%=rs.getInt("Edad")%>' />
                     <jsp:setProperty name="Tester" property="correo" value='<%=rs.getString("Correo")%>' />
                  
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
