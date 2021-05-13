<%-- 
    Document   : GenerarPdf
    Created on : 04-30-2021, 03:24:04 PM
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
        <link rel="stylesheet" href="css/pdf.css">
        <link rel="stylesheet" href="css/normalize.css">
        <title>Jefe de Area Funcional</title>
    </head>
    <body>



        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="GenerarPdf.jsp" class="active" >Generar Pdf</a> 
                    <a href="JefeFuncional.jsp">Atras</a>

            </nav>
        </div>

        <div class="contenedor">

            <form class="form_user" action="${pageContext.request.contextPath}/JAF?accion=ingresar" target="" method="post" name="formDepa">

                <label class="titulo" for="start">Fecha Inicio </label>

                <input class ="input_login" type="date" id="start" name="trip-start"
                       value="2021-01-01"
                       min="2021-04-01" max="2022-12-31">
                <br>
                
                
                <label class="titulo" for="start">Fecha final </label>

                <input class ="input_login" type="date" id="start" name="trip-start"
                       value="2021-01-01"
                       min="2021-04-01" max="2022-12-31">
                <br>

                <button  class="btn_user" type="submit" name="accion" value="ingresar"> Generar PDF </a>
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