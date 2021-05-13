<%-- 
    Document   : Bitacora
    Created on : 05-06-2021, 03:37:05 PM
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
        <link rel="stylesheet" href="css/nice.css">
        <link rel="stylesheet" href="css/style.css">
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
                <a href="Programador.jsp">Casos Asignados</a>
                 <a href="Ver Bitacora.jsp" class="active">Ver Bitacora </a>  
                <a href="Devueltos.jsp" >Casos Devueltos </a>  
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>


        <div class="contenedor"> 

            <form class="form_admin" action="${pageContext.request.contextPath}/Programador?accion=ingresar" target="" method="post" name="formDepa">

                <input class="input_admin" type="hidden" class="info" id="id" name="id" value="${param.id}"  placeholder="Ingresa  el Nombre" >

                <label class="titulo" for="actua">Nombre de la actualizacion</label><br> 
                <input class="input_admin" type="text" name="actua" id="actua"/>
                <br><br>
                <label class="titulo" for="mensaje">  Descripcion </label>  <br>  
                <textarea class="xd" name="mensaje" for="mensaje" placeholder="describe brevemente en menos de 1000 car�cteres" maxlength="1000'"></textarea>
                <br>

                <label  class="titulo" for="EC"> Estado del caso</label> <br>
                <select class="input_admin" name="EC">   
                    <option>en desarrollo</option> 
                    <option>Esperando aprobaci�n de �rea solicitante</option>  
                </select>

                <br> <br>
                <button  class="btn_admin" type="submit" name="accion" value="ingresar"> Ingresar </a>
            </form>

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