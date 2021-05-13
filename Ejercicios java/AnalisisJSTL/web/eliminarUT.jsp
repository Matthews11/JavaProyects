<%-- 
    Document   : eliminarUT
    Created on : 04-21-2021, 08:31:37 PM
    Author     : jared
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>Elminar Usuario</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="estilo1.css">
       <link rel="stylesheet" href="estilo.css">
    
    </head>
    
    <body>
        
        
        <div class="container">
             <div class="titulo"> Eliminar Tipo de usuarios</div>
            <div class="contenedor">
              
 
                <form role="form" action="eliminarUTT.jsp" method="POST">
                        <div class="well well-sm"><strong><span class="glyphicon glyphiconasterisk"></span>Ingrese el ID del usuario a Eliminar  </strong></div>
                           <input type="hidden" class="info" id="Id_Tipo_Usuario" name="Id_Tipo_Usuario" placeholder="Ingresa  el Nombre" >
                        
                        <br>
                         <input type="submit" class="btn btn-info" value="Refrescar">
<br><br>
                </form>
                <%-- Verificando si la variable resultado esta vacia--%>
                <%if (request.getParameter("resultado") != null) {
                %>
                <div class="alert alert-success col-md-10">
                    <b><%=request.getParameter("resultado")%></b>
                </div>
                <%
                    }
                %>
                 
          
            <!--notese el uso de jsp:include -->
            <jsp:include page="mostrarUT.jsp" />
        </div>
             <!-- /container --></body>
</html>
