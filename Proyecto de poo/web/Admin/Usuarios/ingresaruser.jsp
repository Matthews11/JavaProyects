<%-- 
    Document   : ingresardepa
    Created on : 04-25-2021, 06:00:49 PM
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
        <link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/usuario.css">
        <title>Usuarios | Ingresar </title>
    </head>
    <body>

        <div class="header">
            <div class="logo">
                <img src="../img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="../Administrador.jsp" >Departamentos</a> 
                <a href="../Usuarios.jsp" class="active">Usuarios</a> 
                <a href="../Personal.jsp">Personal por Departamentos</a>
                <a href="../Login.jsp">Cerrar Sesion</a>
                
            </nav>
        </div>
        <sql:query var="q1" dataSource="jdbc/mysql">
            SELECT * from Tipo_Usuario; 

        </sql:query>
              <sql:query var="q11" dataSource="jdbc/mysql">
            SELECT * from Departamento; 

        </sql:query>
            
            
            
            
            
        <div class="contenedor">
            
            
            <div class="cont_user">
                <h2 class="titulo2">Registro de Usuario</h2>
                
            <form class="form_user" action="${pageContext.request.contextPath}/Usuarios?accion=ingresar" target="" method="post" name="formDepa">
                
                <div class="user_img">
                    <img src="../img/usuario.png">
                </div>
                
                <p class="titulo" for="nombre">Nombre del Usuario</p>
                <input class ="input_login" type="text" name="nombre" id="nombre" placeholder="Ingrese el nombre Usuario"/>
                
                
                
                <br>
                <p class="titulo" for="edad">Contraseña</p>
                <input class ="input_login" type="password" name="contra" id="contra" placeholder="Ingrese la Contraseña "/>
                <br>
                
                
                <p class="titulo" for="tp">Seleccione el tipos de usuario</p>
                <select class ="input_login" name="TipoUsuario">
                    <c:forEach var="tp" items="${q1.rows}"> 
                            <option>${tp.Tipo_Usuario}</option> 
                    </c:forEach> 
                </select>

                <br>

                <p class="titulo" for="es">Seleccione el Estado del usuario</p>
                <select class ="input_login" name="es">

                    <option>Activo</option> 
                    <option>No activo</option>  

                </select>
                <br>
                  <p class="titulo" for="depa">Seleccione el Departamento</p>
                <select class ="input_login" name="depa">
                    <c:forEach var="depa" items="${q11.rows}"> 
                            <option>${depa.NombreDepartamento}</option> 
                    </c:forEach> 
                </select>

                <br>
               
                <a class="btn_user" href="../Usuarios.jsp"> Atras</a>
                <button class="btn_user"  type="submit" name="accion" value="ingresar">Ingresar</a>
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