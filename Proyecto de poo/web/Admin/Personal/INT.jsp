<%-- 
    Document   : INT
    Created on : 04-25-2021, 07:54:37 PM
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
        <link rel="stylesheet" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/Personal.css">
        <link rel="stylesheet" href="../css/normalize.css">
        <title>Personal | Agregar Tester</title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="../img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="../Administrador.jsp" >Departamentos</a> 
                <a href="../Usuarios.jsp" >Usuarios</a> 
                <a href="../Personal.jsp" class="active">Personal por Departamentos</a>
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>

        <div class="contenedor">
            <div class="cont_user">
                 <h2 class="titulo">Ingresar Tester</h2>
            <form class="form_user" action="${pageContext.request.contextPath}/Personal?accion=ingresarT" target="" method="post" name="formDepa">
                <div class="user_img">
                    <img src="../img/usuario.png">
                </div>
                <p class="titulo1" for="nombre">Nombre del programador</label>
                <input class ="input_login" type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre del departamaneto"/>
                <br>
                 <p class="titulo1" for="edad">Edad</label>
                <input class ="input_login" type="text" name="edad" id="edad" placeholder="Ingrese la edad "/>
                <br>
                <p class="titulo1" for="numero">Vaya a la tabla usuarios Registre al programador para asignar el numero de usuario</label> 
               <br> <label for="nombre">Numero de usuario</label>
                <input class ="input_login" type="text" name="Numero" id="Numero" placeholder="Numero de usuario"/>
               <br> 
                 <p class="titulo1" for="correo">Correo</label>
                 <input class ="input_login" type="email" id="email" name="email"placeholder="Ingrese el correo" pattern="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}">
	    <br>
                <a class="btn_user" href="../Personal.jsp"> Atras</a>
                <button class="btn_user"  type="submit" name="accion" value="ingresar"> Ingresar </a>
            </form>
 
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
                    <img src="../img/fc.svg" alt="" srcset="">
                </div>
                <div class="dos">
                    <img src="../img/ig.svg" alt="" srcset="">
                </div>

            </div>

        </div>
        <div class="copy"></div>
    </body>
</html>
