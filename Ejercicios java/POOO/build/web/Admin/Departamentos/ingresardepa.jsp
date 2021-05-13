<%-- 
    Document   : ingresardepa
    Created on : 04-25-2021, 06:00:49 PM
    Author     : jared
--%>

<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page import="sv.controls.company.controlador.departamento"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/estilo.css">
        <link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/admin.css">
        <title>Departamentos | Ingresar</title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="../img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="../Administrador.jsp" class="active">Departamentos</a> 
                <a href="../Usuarios.jsp">Usuarios</a> 
                <a href="../Personal.jsp">Personal por Departamentos</a>
                <a href="../Login.jsp">Cerrar Sesion</a>
            </nav>
        </div>

        
        
        <div class ="contenedor">

            <div class="cont_admin">
                <h2 class="titulo">Crear nuevo Departamento</h2>
            <form class="form_admin" action="${pageContext.request.contextPath}/departamento?accion=ingresar" target="" method="post" name="formDepa">
                <div class="user_img">
                    <img src="../img/departamentos.png">
                </div>
                <input class="input_admin" type="text" name="depa" id="depa" placeholder="Nombre del departamaneto"/>
                <a class="btn_admin" href="../Administrador.jsp"> Atras</a>
                <button  class="btn_admin" type="submit" name="accion" value="ingresar"> Ingresar </button>
                
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
       
      
    </body>
</html>