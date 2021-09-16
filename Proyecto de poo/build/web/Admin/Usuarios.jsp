<%-- 
    Document   : Usuarios
    Created on : 04-25-2021, 06:19:36 PM
    Author     : jared
--%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilo.css">
        <link rel="stylesheet" href="css/usuario.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Usuarios</title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">

                <a href="Administrador.jsp">Departamentos</a> 
                <a href="Usuarios.jsp" class="active">Usuarios</a> 
                <a href="Personal.jsp">Personal por Departamentos</a>

                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>

        <div class="contenedor">
            <div class="cont_tabla">
            <h1 class="titulo_user">Tabla usuarios</h1>
            <sql:query var="q1" dataSource="jdbc/mysql">
                SELECT u.Id_Usuario, u.Nombre_Usuario, u.IdEstadoUsuario, tp. Tipo_Usuario, d.NombreDepartamento   , u.Contrasena from Usuarios u
                inner join Tipo_Usuario tp on u.IdTipoUsuario= tp.Id_Tipo_Usuario 
                inner join Departamento d on u.IdDepartamento= d.IdDepartamento; 

            </sql:query>

            <sql:query var="q11" dataSource="jdbc/mysql">
                SELECT * from Tipo_Usuario; 

            </sql:query>
           
           
                <table class="tabla_user">
                    <thead>
                        <tr>

                            <th class="tabla_titulo1">Nombres</th>
                            <th class="tabla_titulo">Contraseña</th>
                            <th class="tabla_titulo">Tipo usuario</th>
                            <th class="tabla_titulo">Estado usuario</th>
                            <th class="tabla_titulo">Departamento</th>
                            <th class="tabla_titulo"></th>
                            <th class="tabla_titulo">Operaciones</th>
                            <th class="tabla_titulo"></th>


                        </tr>
                    </thead>


                    <tbody class="tabla_cuerpo">
                        <c:forEach var="usuario" items="${q1.rows}">
                            <c:choose>
                                <c:when test="${usuario.IdEstadoUsuario == 1}">

                                    <tr>
                                        <td><c:out value="${usuario.Nombre_Usuario}"/></td> 
                                        <td><c:out value="***********"/></td> 
                                        <td><c:out value="${usuario.Tipo_Usuario}"/></td> 
                                        <td><c:out value="Activo"/></td>  
                                        <td><c:out value="${usuario.NombreDepartamento}"/></td> 
                                        
                                        <td><a class="btn_funcion ingre" href='Usuarios/ingresaruser.jsp'>Ingresar</a></td> 
                                        <td> <a class="btn_funcion mod" href='Usuarios/modificaruser.jsp?id=${usuario.Id_Usuario}&nombre=${usuario.Nombre_Usuario}
                                                &contrasena=${usuario.Contrasena} &tipo=${usuario.Tipo_Usuario}&pa=${usuario.NombreDepartamento}
                                                &es=Activo'>Modificar</a> </td>
                                        <td>  <a class="btn_funcion eli" href='Usuarios/eliminaruser.jsp?id=${usuario.Id_Usuario}&nombre=${usuario.Nombre_Usuario}
                                                 &contrasena=${usuario.Contrasena} &tipo=${usuario.Tipo_Usuario}&depa=${usuario.NombreDepartamento}
                                                 &es=Activo'>Eliminar</a> </td>
                                    </tr> 
                                </c:when> 

                                <c:when test="${usuario.IdEstadoUsuario == 0}">

                                    <tr>
                                        <td><c:out value="${usuario.Nombre_Usuario}"/></td> 
                                        <td><c:out value="***********"/></td> 
                                        <td><c:out value="${usuario.Tipo_Usuario}"/></td> 
                                        <td><c:out value="No activo"/></td>  
                                        <td><c:out value="${usuario.NombreDepartamento}"/></td> 
                                        <td>       <a class="le" href='Usuarios/ingresaruser.jsp'>Ingresar</a> </td>
                                        <td>  <a class="le" href='Usuarios/modificaruser.jsp?id=${usuario.Id_Usuario}&nombre=${usuario.Nombre_Usuario}
                                                &contrasena=${usuario.Contrasena} &tipo=${usuario.Tipo_Usuario}&depa=${usuario.NombreDepartamento}
                                                &es=No activo'>Modificar</a> </td>
                                        <td> <a class="le" href='Usuarios/eliminaruser.jsp?id=${usuario.Id_Usuario}&nombre=${usuario.Nombre_Usuario}
                                                &contrasena=${usuario.Contrasena} &tipo=${usuario.Tipo_Usuario}&depa=${usuario.NombreDepartamento}
                                                &es=No activo'>Eliminar</a> </td>
                                    </tr> 
                                </c:when> 
                            </c:choose>


                        </c:forEach>

                    </tbody>
                </table>
                </div>
                
            <div class="cont_tabla">
                 <h1  class="titulo_user">Tabla Tipo usuarios</h1>
                <table class="tabla_user">
                    <thead>
                        <tr>

                            <th class="tabla_titulo2">Nombres</th> 
                            <th class="tabla_titulo"></th>
                            <th class="tabla_titulo">Operaciones</th>
                            <th class="tabla_titulo"></th>
                        </tr>
                    </thead> 

                    <c:forEach var="tp" items="${q11.rows}"> 
                        <tr>
                            <td><c:out value="${tp.Tipo_Usuario}"/></td> 

                            <td> <a class="btn_funcion ingre" href='Usuarios/ingresartp.jsp'>Ingresar</a></td> 
                            <td> <a class="btn_funcion mod" href='Usuarios/modificartp.jsp?id=${tp.Id_Tipo_Usuario}&nombre=${tp.Tipo_Usuario}'>Modificar</a> </td>
                            <td>  <a class="btn_funcion eli" href='Usuarios/eliminartp.jsp?id=${tp.Id_Tipo_Usuario}&nombre=${tp.Tipo_Usuario}'>Eliminar</a> </td>
                        </tr> 
                    </c:forEach>

                </table>

            </div>
        </div>
        </div>
        
        
                <div class="fin">
                    <div class="Contactos">
                        <H2>¿Quienes Somos?</H2>
                        <P>Somos un equipo de creativos y redactores que produce contenidos innovadores para lograr objetivos de comunicación. Convertimos en palabras cualquier formato de ideas. Somos especialistas en redactar soluciones a la medida de un mensaje. Incorporamos constantemente las últimas tendencias de la comunicación y las tecnologías para ayudar a nuestros clientes a alcanzar el éxito.
                            Los contenidos se convierten en una fuente de innovación que marca la diferencia, actúan como facilitadores y catalizadores del éxito. Ya no se trata de tener un mensaje sino de que sea inolvidable. Nuestra responsabilidad es descubrir lo que necesita el cliente y  decirlo sin que falte o sobre una palabra.</P>
                    </div>
                    <div class="Areas">
                        <H2>Servicios</H2>
                        <p>Administrar</p>
                        <p>Jefes Funcionales</p>
                        <p>Jefes en Areas</p>
                        <p>Testers </p>
                        <p>Programadores</p>

                    </div>
                    <div class="Redes">
                        <H2>Redes</H2>
                        <div class="uno">
                            <img src="img/fc.svg" alt="" srcset="">
                        </div>
                        <div class="dos">
                            <img src="img/ig.svg" alt="" srcset="">
                        </div>

                    </div>

            
                 
                <div class="copy"></div>
                
                
                </body>
                </html>