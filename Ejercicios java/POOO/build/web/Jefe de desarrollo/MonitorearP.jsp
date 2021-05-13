<%-- 
    Document   : MonitorearP
    Created on : 05-02-2021, 07:03:19 PM
    Author     : jared
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilo.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Jefe de Desarrollo</title>
    </head>
    <body>



        <sql:query var="sq" dataSource="jdbc/mysql">
            SELECT BD.Titulo, BD.IdCaso, EC.EstadoCaso, C.FechaJD from Casos C
            inner join Bitacora_Developer BD on C.IdCaso=BD.IdCaso
            inner join EstadoCaso EC on C.IdEstatoCaso=EC.IdEstadoCaso;

        </sql:query>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="JefeDesarrollo.jsp"class="active">Administrar Casos</a>
                <a href="MonitorearP.jsp" >Monitorear Programador </a>  
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>

        <div class="contenedor">

            <table class="tabla_Depa">
                <thead >
                    <tr>
                       
                        <th class="tabla_titulo">Actualizacion</th>
                        <th class="tabla_titulo">Estado de Caso</th> 
                        <th class="tabla_titulo">Fecha</th>  
                    </tr>

                </thead> 
                <tbody class="tabla_cuerpo">
                    <c:forEach var="jd" items="${sq.rows}"> 
                        <tr>
                          
                            <td> <c:out value="${jd.Titulo}"/>  </td>
                            <td> <c:out value="${jd.EstadoCaso}"/>  </td>
                            <td> <c:out value="${jd.FechaJD}"/>  </td>

                        </tr>

                    </c:forEach> 
                </tbody>
            </table>

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