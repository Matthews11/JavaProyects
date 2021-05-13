<%-- 
    Document   : index
    Created on : 04-06-2021, 03:56:13 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CRUD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilo.css">
    </head>
    <body>
        <div class="titulo"> Mantenimiento a Tester y Desarrolladores</div>

        <div> 
            <form action="Usuarios.html" method="POST">
            <table class="tabla">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <p>Usuarios </p>
                       
                             <li><a href="mostrarUB.jsp">ver</a></li>  
                            <li><a href="ModificarUB.jsp">modificar</a></li> 
                            <li><a href="EliminarUB.jsp">Eliminar</a></li> 
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
                            <p>Tipo Usuario </p>
                          
                        <li><a href="mostrarTUB.jsp">ver</a></li> 
                         
                            <li><a href="ModificarTUB.jsp">modificar</a></li> 
                            <li><a href="EliminarTUB.jsp">Eliminar</a></li> 
                       </td>
                    </tr>
                </tbody>
            </table>
        </form>
        </div> 
        
        
    </body>
</html>
