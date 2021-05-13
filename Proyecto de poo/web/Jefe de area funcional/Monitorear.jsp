<%-- 
    Document   : Monitorear
    Created on : 04-29-2021, 01:43:33 PM
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
        <link rel="stylesheet" href="css/stilemonitoreo.css">
        <title>Jefe de Area Funcional</title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <sql:query var="sq" dataSource="jdbc/mysql">
                    SELECT * from Bitacora_Testing
                    ; 

                </sql:query>
                <a href="Monitorear.jsp"class="active" >Monitorear casos</a> 
                
                <a href="JefeFuncional.jsp">Atras</a>

            </nav>
        </div>

        <div class="contenedor">
            <div class="cont_tabla">
                <h2 class="titulo">Casos</h2>
                <sql:query var="sq" dataSource="jdbc/mysql">
                    SELECT c.DescripcionA, c.RazonRechazo, ec.EstadoCaso, ec.IdEstadoCaso, c.PorcentajeAvance, c.FechaJD, bt.FechaPuesta from casos  c 
                    inner join estadocaso ec on  c.IdEstatoCaso = ec.IdEstadoCaso 
                    left join Bitacora_Testing bt on c.IdCaso = bt.IdCaso
                    ; 

                </sql:query>

                <table class="tabla_Depa">
                    <thead>
                        <tr>

                            <th class="tabla_operaciones">Descripcion</th>
                            <th class="tabla_operaciones">Razon del rechazo</th>
                            <th class="tabla_operaciones">Estado de caso</th>
                            <th class="tabla_operaciones">Porcentaje de avance</th>
                            <th class="tabla_operaciones">Fecha Limite</th>



                        </tr>
                    </thead>


                    <tbody>
                        <c:forEach var="casos" items="${sq.rows}">
                            <c:choose>
                                <c:when test="${casos.IdEstadoCaso == 1}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="No ha sido Rechazado"/></td> 

                                        <td><c:out value="en espera de respuesta"/></td>  
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td>
                                         <td><c:out value="${casos.FechaJD}"/></td>


                                    </tr> 
                                </c:when> 

                                <c:when test="${casos.IdEstadoCaso == 2}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="${casos.RazonRechazo}"/></td>

                                        <td><c:out value="solicitud rechazada"/></td> 
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td> 
                                         <td><c:out value="${casos.FechaJD}"/></td> 

                                    </tr> 
                                </c:when> 

                                <c:when test="${casos.IdEstadoCaso == 3}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="No ha sido Rechazado"/></td> 

                                        <td><c:out value="en desarrollo"/></td> 
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td>  
                                         <td><c:out value="${casos.FechaJD}"/></td> 

                                    </tr> 
                                </c:when> 


                                <c:when test="${casos.IdEstadoCaso == 4}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="No ha sido Rechazado"/></td> 

                                        <td><c:out value="vencido"/></td> 
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td> 
                                         <td><c:out value="${casos.FechaJD}"/></td> 

                                    </tr> 
                                </c:when> 


                                <c:when test="${casos.IdEstadoCaso == 5}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="No ha sido Rechazado"/></td> 

                                        <td><c:out value="Esperando aprobación del área solicitante "/></td> 
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td> 
                                         <td><c:out value="${casos.FechaJD}"/></td>

                                    </tr> 
                                </c:when> 


                                <c:when test="${casos.IdEstadoCaso == 6}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="No ha sido Rechazado"/></td> 

                                        <td><c:out value="Finalizado"/></td> 
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td> 
                                        <td><c:out value="${casos.FechaJD}"/></td> 
                                    </tr> 
                                </c:when> 

                                <c:when test="${casos.IdEstadoCaso == 7}">

                                    <tr>
                                        <td><c:out value="${casos.DescripcionA}"/></td> 

                                        <td><c:out value="No ha sido Rechazado"/></td> 

                                        <td><c:out value="Devuelto con observaciones"/></td> 
                                        <td>  <progress max="100" value="${casos.PorcentajeAvance}"></td> 
                                        <td><c:out value="No se ha establecido una fecha de puesta"/></td> 
                                         <td><c:out value="${casos.FechaJD}"/></td>

                                    </tr> 
                                </c:when>

                            </c:choose>
                        </c:forEach>

                    </tbody>
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

    </div>
    <div class="copy"></div>
</body>
</html>
