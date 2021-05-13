<%-- 
    Document   : Aceptar
    Created on : 05-05-2021, 11:46:07 AM
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
            SELECT *  from Programadores ;

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
            <form action="${pageContext.request.contextPath}/JefeDesarrollo?accion=aceptar" target="" method="post" name="formDepa">



                <input type="hidden" class="info" id="id" name="id" value="${param.id}"  placeholder="Ingresa  el Nombre" >



                <label for="mensaje">Descripcion de Caso</label>  <br>  <br>
                <textarea name="mensaje" for="mensaje" placeholder="describe brevemente en menos de 1000 car�cteres" maxlength="1000'"></textarea>
                <br> 



                <label for="tp"> Seleccione el Programador</label>
                <select name="progra">
                    <c:forEach var="p" items="${sq.rows}"> 
                        <option>${p.NombreProgramador}</option> 
                    </c:forEach> 
                </select>

                <br><br>

                <label for="start">Fecha de Caso</label>

                <input type="date" id="start" name="fecha"
                       value="2021-01-01"
                       min="2021-04-01" max="2022-12-31">


                <br>

                <button   type="submit" name="accion" value="ingresar"> Enviar Caso </a>
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