<%-- 
    Document   : Login
    Created on : 04-23-2021, 03:36:38 PM
    Author     : jared
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sv.controls.company.controlador.Login"%>
<%@page session="true"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="estilo.css">
        <link rsel="stylesheet" href="normalize.css">
        <link rel="stylesheet" href="Loginestilo.css">
        <title>Inicio de Sesion</title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
               
            </nav>
        </div>

        
        <div class="contenedor">
            
            
            <div class="login">
                <h1 class="titulo_login">INGRESE SUS CREDENCIALES</h1>
            <form class="f_log"action="Login" target="" method="get" name="Login"> 
                <div class="user_img">
                    <img src="img/logo.png">
                </div>
                
               <!-- <label class="label_login" for="name">Nombre</label> -->
                <input class="input_login" type="text" name="name" id="name" placeholder="Usuario" required/>
              <!--  <label  class="label_login" for="password" />Contraseña</label>-->
           
                <input class="input_login" type="password" name="password" id="password" placeholder="Contraseña" required />
                <input class="btn_login" type="submit" name="Iniciar Sesion" value="Iniciar Sesion"/>
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
                    <img src="img/fc.svg" alt="" srcset="">
                </div>
                <div class="dos">
                    <img src="img/ig.svg" alt="" srcset="">
                </div>

            </div>

        </div>
        <div class="copy"></div>


        <%
            // manejo de sesiones
            HttpSession sesion = request.getSession();
            int rol = 0;

            if (request.getAttribute("rol") != null) {
                rol = (Integer) request.getAttribute("rol");

                if (rol == 1) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Admin/Administrador.jsp");
                }
                if (rol == 2) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Jefe de area funcional/JefeFuncional.jsp");
                }
                if (rol == 3) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Testert/Probador.jsp");
                }
                if (rol == 4) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Jefe de desarrollo/JefeDesarrollo.jsp");
                }
                if (rol == 5) {
                    sesion.setAttribute("nombre", request.getAttribute("nombre"));
                    sesion.setAttribute("rol", rol);
                    response.sendRedirect("Programador/Programador.jsp");
                } else {
        %> <script >alert("Usuario Invalido, Ingrese el usuario o la contraseña correctamente");</script>
        <% }
            }


        %>     
    </body>
</html>