<%-- 
    Document   : JefesDesarrollo
    Created on : 04-23-2021, 11:33:02 PM
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
        <link rel="stylesheet" href="css/stilesolicitud.css">
        <title>Jefe de Area Funcional</title>
    </head>
    <body>
        
        <sql:query var="sql" dataSource="jdbc/mysql">
            SELECT * from departamento ; 

        </sql:query>

        <sql:query var="ql" dataSource="jdbc/mysql">
            SELECT u.Nombre_Usuario, EF.NombreEmpleado, tp.Tipo_Usuario from usuarios u 
            inner join EmpleadoAreaFuncional EF on u.Id_Usuario = EF.IdUsuario 
            inner join Tipo_Usuario tp on u.IdTipoUsuario=tp.Id_Tipo_Usuario 
            where tp.Tipo_Usuario like '%Jefe de desarrollo%';
        </sql:query>

        <div class="header">
            <div class="logo">
                <img src="img/logo.png" alt="" srcset="">
            </div>
            <div class="espacio"></div>
            <nav class="menu-main">
                <a href="JefeFuncional.jsp"class="active">Crear una solicitud de caso</a>
                <a href="Monitorear.jsp" >Monitorear casos</a> 
                
                <a href="../Login.jsp">Cerrar Sesion</a>

            </nav>
        </div>

        <div class="contenedor">
            
             <div class="cont_user">
                <h2 class="titulo2">Registro de Usuario</h2>

            <form class="form_user" action="${pageContext.request.contextPath}/JAF?accion=ingresar" target="" method="post" name="formDepa">
                
                 <div class="user_img">
                    <img src="img/solicitud.png">
                </div>
                
                <label class="titulo" for="mensaje">Descripcion de Caso</label>  <br>  <br>
                <textarea class ="input_login" name="mensaje" for="mensaje" placeholder="describe brevemente en menos de 1000 car�cteres" maxlength="1000'"></textarea>
                <br>
                 
                <label class="titulo" for="tp"> Departamento</label>
                <select class ="input_login" name="depa">
                    <c:forEach var="depa" items="${sql.rows}"> 
                        <option>${depa.NombreDepartamento}</option> 
                    </c:forEach> 
                </select>

                <br>

                <label class="titulo" for="tp"> Seleccione el Jefe de Desarrollo</label>
                <select class ="input_login" name="jd">
                    <c:forEach var="jd" items="${ql.rows}"> 
                        <option>${jd.NombreEmpleado}</option> 
                    </c:forEach> 
                </select>

                <br>



                <button  class="btn_user" type="submit" name="accion" value="ingresar"> Ingresar </a>
            </form>




            </div>
            
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