<%-- 
    Document   : index
    Created on : 04-21-2021, 09:16:16 AM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CRUD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <link rel="stylesheet" href="estilo1.css">
       <link rel="stylesheet" href="estilo.css">
    
    </head>
    <body>
        <div class="titulo"> Mantenimiento a Usuarios y Tipo Usuarios</div>

        <div> 
            <form action="Usuarios.html" method="POST">
            <table class="tabla">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <p>Usuarios </p>
                       
                             <li><a href="mostrarUB.jsp">ver</a></li>  
                            <li><a href="modificarUB.jsp">modificar</a></li> 
                            <li><a href="eliminarUB.jsp">Eliminar</a></li> 
                       </td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div> 
        
         <div> 
            <form action="Usuarios.html" method="POST">
            <table class="tabla">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <p>Tipo Usuarios </p>
                          
                             <li><a href="mostrarUT.jsp">ver</a></li>  
                            <li><a href="modificarUT.jsp">modificar</a></li> 
                            <li><a href="eliminarUT.jsp">Eliminar</a></li> 
                       </td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div> 
        
        
              <div> 
            <form action="Usuarios.html" method="POST">
            <table class="tabla">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <p>Usuarios y Tipo Usuarios </p>
                          
                             <li><a href="mostrarUTU.jsp">ver</a></li>  
                           
                       </td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div> 
        
        
    </body>
</html>
