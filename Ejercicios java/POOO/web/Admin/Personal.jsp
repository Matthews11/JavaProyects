<%-- 
    Document   : Personal
    Created on : 04-25-2021, 07:47:45 PM
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
        <link rel="stylesheet" href="css/Personal.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Personal</title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">

                <a href="Administrador.jsp">Departamentos</a> 
                <a href="Usuarios.jsp">Usuarios</a> 
                <a href="Personal.jsp" class="active">Personal por Departamentos</a>
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div> 
        <div class="contenedor">
            
            
            <div class="cont_tabla">
            <h2 class="titulo_user">Tabla Programador</h2>

            <sql:query var="q1" dataSource="jdbc/mysql">
                SELECT * from Programadores ;
            </sql:query>
                
                
            <div class="contenedor">
                <table class="tabla_user">
                    <thead >
                        <tr>

                            <th class="tabla_titulo1" >Nombres del programador</th> 
                            <th class="tabla_titulo2">Edad</th>
                            <th class="tabla_titulo3">Correo</th>
                            <th class="tabla_titulo"></th>
                            <th class="tabla_titulo">Operaciones</th>
                            <th class="tabla_titulo"></th>
                             
                     


                        </tr>
                    </thead>
                    <tbody class="tabla_cuerpo">
                        <c:forEach var="progra" items="${q1.rows}">
                            <tr>
                                <td><c:out value="${progra.NombreProgramador}"/></td> 
                                <td><c:out value="${progra.Edad}"/></td> 
                                <td><c:out value="${progra.Correo}"/></td> 
                               


                                <td>   <a class="btn_funcion ingre" href='Personal/INP.jsp'>Ingresar</a> </td> 
                                <td>   <a class="btn_funcion mod" href='Personal/MODP.jsp?id=${progra.IdProgramador}&nombre=${progra.NombreProgramador}&edad=${progra.Edad} &correo=${progra.Correo}'>Modificar</a> </td> 
                                <td>   <a class="btn_funcion eli" href='Personal/DELP.jsp?id=${progra.IdProgramador}&nombre=${progra.NombreProgramador}&edad=${progra.Edad} &correo=${progra.Correo} '>Eliminar</a> </td> 

                            </tr> 
                        </c:forEach>

                    </tbody>
                </table>
                
              
                  <h2 class="titulo_user">Tabla Empleado Funcional </h2>
            <sql:query var="q1" dataSource="jdbc/mysql">
                SELECT * from EmpleadoAreaFuncional;
            </sql:query>
          
                <table class="tabla_user">
                    <thead>
                        <tr>

                            <th class="tabla_titulo1">Nombres del empleado </th>
                            <th class="tabla_titulo2">Edad</th>
                            <th class="tabla_titulo3">Nombres</th>
                            <th class="tabla_titulo"></th>
                            <th class="tabla_titulo">Operaciones</th>
                            <th class="tabla_titulo"></th>


                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="em" items="${q1.rows}">
                            <tr>
                                <td><c:out value="${em.NombreEmpleado}"/></td> 
                                <td><c:out value="${em.Edad}"/></td> 
                                <td><c:out value="${em.Correo}"/></td> 
                                <td>   <a class="btn_funcion ingre" href='Personal/INT.jsp'>Ingresar</a> </td> 
                                <td>   <a class="btn_funcion mod" href='Personal/MOFT.jsp?id=${em.IdEmpleado}&nombre=${em.NombreEmpleado}&edad=${em.Edad} &correo=${em.Correo}'>Modificar</a> </td> 
                                <td>   <a class="btn_funcion eli" href='Personal/DELT.jsp?id=${em.IdEmpleado}&nombre=${em.NombreEmpleado}&edad=${em.Edad} &correo=${em.Correo} '>Eliminar</a> </td> 


                            </tr> 
                        </c:forEach>

                    </tbody>
                </table>
                  </div>
              
            </div>

        </div>

        <div class="fin">
            <div class="Contactos">
                <H2>�Quienes Somos?</H2>
                <P>Somos un equipo de creativos y redactores que produce contenidos innovadores para lograr objetivos de comunicaci�n. Convertimos en palabras cualquier formato de ideas. Somos especialistas en redactar soluciones a la medida de un mensaje. Incorporamos constantemente las �ltimas tendencias de la comunicaci�n y las tecnolog�as para ayudar a nuestros clientes a alcanzar el �xito.
                    Los contenidos se convierten en una fuente de innovaci�n que marca la diferencia, act�an como facilitadores y catalizadores del �xito. Ya no se trata de tener un mensaje sino de que sea inolvidable. Nuestra responsabilidad es descubrir lo que necesita el cliente y  decirlo sin que falte o sobre una palabra.</P>
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
        </div>
         
        <div class="copy"></div>
    </body>
</html>