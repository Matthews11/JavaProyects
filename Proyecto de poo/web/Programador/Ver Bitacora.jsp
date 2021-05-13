<%-- 
    Document   : Ver Bitacora
    Created on : 05-06-2021, 04:22:01 PM
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
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/monitoreo.css">
        <title>Programador</title>
    </head>
    <body>



        <sql:query var="sq" dataSource="jdbc/mysql">
            SELECT bd.Descripcion, bd.Titulo, ec.EstadoCaso, c.IdEstatoCaso  from Casos c 
            inner join EstadoCaso ec on c.IdEstatoCaso = ec.IdEstadoCaso 
            inner join Bitacora_Developer bd on c.IdCaso = bd.IdCaso;

        </sql:query>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="Programador.jsp">Casos Asignados</a>
                <a href="Ver Bitacora.jsp"class="active" >Ver Bitacora </a>  
                <a href="Devueltos.jsp" >Casos Devueltos </a>  
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>


        <div class="contenedor"> 
            <table class="tabla_Depa">
                <thead >
                    <tr>
                        <th class="tabla_operaciones">Titulo</th>
                        <th class="tabla_operaciones">Descripcion de la actualizacion</th>
                        <th class="tabla_operaciones">Estado</th> 
                    </tr>

                </thead>



                <tbody class="tabla_cuerpo">
                    <c:forEach var="jd" items="${sq.rows}"> 
                        <c:choose>

                               <c:when test="${jd.IdEstatoCaso==3}">        
                                <tr>
                                  
                                    <td>   <c:out value="${jd.Descripcion}"/> </td>
                                      <td>  <c:out value="${jd.Titulo}"/>  </td>
                                    <td>   <c:out value="${jd.EstadoCaso}"/> </td> </td> 



                                </tr>
                            </c:when>
                    
                         
                        </c:choose>
                    </c:forEach> 
                </tbody>
            </table>




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