<%-- 
    Document   : CrearEstado
    Created on : 04-20-2021, 7:30:28 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
         <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#" style="color: white">Telecomunicaciones SV</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#" style="color: white" >Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#" style="color: white">Información</a>
                        </li>
                        <li class="nav-item" >
                            <a class="nav-link" href="#" tabindex="-1" aria-disabled="true" style="color: white">Desarrolladores</a>
                        </li>
                    </ul>
                    <button type="button" class="btn btn-danger">Iniciar sesión</button>
                </div>
            </div>
        </nav>
        
        <section>
            
        <div id="login">
        <h3 class="text-center text-white pt-5">Ingrese sus datos de secion</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="testerPD.jsp" method="post">

                            <h3 class="text-center text-info">Crear un caso nuevo</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Nombre del caso</label><br>
                                <input type="text" name="nombre" id="nombre" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Descipcion</label><br>
                                <input type="text" name="desc" id="contra" class="form-control">
                            </div>
                            <div class="form-group">
                                <input type="submit" name="agregar" class="btn btn-info btn-md" value="Agregar Caso" >
                            </div>

                            
                             <div class="form-group">

                                    <a href="JefeAreaFuncional.jsp" class="btn btn-primary">Regresar</a>
                              </div>
                            
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
        </section>
        
        <footer style="background-color: #212529; color: white; text-align: center; position: relative;
   ">
            
            <br>
            
            <p>Universidad Don Bosco</p>
            
            <p>Copyright © 2021 Esdras Cortez, José Hernandez, Kevin Rodriguez, Nicolas Alas, Fernando Merlos todos los reservados.</p>
            
            <br>

        </footer>
        
    </body>
</html>

