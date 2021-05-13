<%-- 
    Document   : Aceptar
    Created on : 05-11-2021, 01:11:45 AM
    Author     : Jared
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
        <link rel="stylesheet" href="css/nice.css">
        <link rel="stylesheet" href="css/tester.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Programador</title>
    </head>
    <body>



        <sql:query var="sq" dataSource="jdbc/mysql">
            SELECT c.DescripcionJ,c.FechaJD, ec.EstadoCaso, c.IdEstatoCaso from Casos c inner join
            EstadoCaso ec on c.IdEstatoCaso = ec.IdEstadoCaso ;

        </sql:query>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                 <a href="Probador.jsp"class="active">Casos Asignados</a> 
                <a href="Ver.jsp"class="active">Casos Finalizados</a> 
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>


          <div class="contenedor"> 

            <form class="form_admin" action="${pageContext.request.contextPath}/Testert?accion=aceptar" target="" method="POST" name="formDepa">


                <input class="input_admin" type="hidden" class="info" id="id" name="id" value="${param.id}"   >


                <label  class="titulo" for="start">Fecha de Puesta</label>

                <input class="input_admin" type="date" id="start" name="fecha"
                       value="2021-05-12"
                       min="2021-05-12" max="2022-12-31" >


                <br>
                <button  class="btn_admin" type="submit" name="accion" value="Aceptar"> Ingresar </a>
            </form>

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