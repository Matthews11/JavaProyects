<%-- 
    Document   : consulta
    Created on : 04-04-2021, 02:38:27 PM
    Author     : jared
--%>

<%@ include file="conexion.jsp"%>
<div class="row col-md-7">
    <table class="table table-striped table-bordered table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Telefono</th>
                <th>Operaciones</th>
            </tr>
        </thead>
        <tbody>
            <%    st = conexion.prepareStatement("select * from Empleados");
                rs = st.executeQuery();
                while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("codigo")%></td>
                <td><%=rs.getString("nombre")%></td>
                <td><%=rs.getString("apellidos")%></td>
                <td><%=rs.getString("telefono")%></td>
                <td><a class="btn btndanger" href='eliminar.jsp '>Eliminar</a></td>
            </tr>
            <%
                }
                conexion.close();
            %>
        </tbody>
    </table>
</div>

