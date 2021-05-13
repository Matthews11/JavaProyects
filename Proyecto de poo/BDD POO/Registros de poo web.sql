 Insert into Tipo_Usuario (Tipo_Usuario) values 
 ("Administrador"),
 ("Jefes de áreas funcionales"),
 ("Testert"),
 ("Jefe de desarrollo"),
 ("Programadores");

  
Insert into Departamento (NombreDepartamento) values 

 ("Comunicaciones"),
 ("Desarrollo"),
 ("Finanzas"),
 ("Ventas"),
 ("Call center"),
 ("Jefes") ;
 
 insert into Usuarios (Nombre_Usuario,IdTipoUsuario,IdDepartamento,IdEstadoUsuario,Contrasena)  value 
 
("Pacheco",1,6,1,"root"),
("Mathew",2,4,1,"m123"),
("Carlos",3,4,1,"c123"),
("Oscar",4,2,1,"lalo123"),
("Jared",5,2,1,"j123"),
("alex",5,2,1,"root"),
("Dave ",3,4,1,"d123");

insert into Programadores (NombreProgramador,IdUsuarios,Edad,Correo) value 
("Jared Pineda",5,19,"Jaredpineda033@gmail.com");
insert into Programadores (NombreProgramador,IdUsuarios,Edad,Correo) value 
("Alejandro torres",6,19,"aleyandrus12@gmail.com");


insert into EmpleadoAreaFuncional (NombreEmpleado,IdUsuario,Edad,Correo) value 
("Carlos Andino",3,20,"charlytorrento777@gmail.com");
insert into EmpleadoAreaFuncional (NombreEmpleado,IdUsuario,Edad,Correo) value 
("Mathews molina",2,20,"mathews19@gmail.com");
insert into EmpleadoAreaFuncional (NombreEmpleado,IdUsuario,Edad,Correo) value 
("Oscar Rodriguez",4,19,"a.oscxr@gmail.com ");
insert into EmpleadoAreaFuncional (NombreEmpleado,IdUsuario,Edad,Correo) value 
("Emerson Dave",7,19,"Dave12@gmail.com "); 

insert into estadocaso (EstadoCaso)
value ("en espera de respuesta"),
("solicitud rechazada"),
("en desarrollo"),
("vencido"),
("Esperando
aprobación del área solicitante"),
("Finalizado")
,("Devuelto con observaciones");

insert into casos (DescripcionA,DescripcionJ,IdDepartamento
,RazonRechazo,IdEstatoCaso,IdProgramador,PorcentajeAvance,FechaJD,IdEmpleado
,IdJefeFuncional,IdTester) value 
("El sistema dejo de funcionar"
,"Hace un debuggin, podria estar una libreria",1,"Formule bien su pdf"
,6,1,"100","20210620",3,2,1);
 

insert into Bitacora_Developer (Descripcion,Titulo,IdCaso,IdProgramador) value 
("no encuentro la falla","analizando el problema para resolverlo",1,1),
("Problema resolvido","Librerias",1,1);

insert into Bitacora_Testing (Observacion,IdCaso,IdEmpleado,FechaT
,FechaPuesta) value ("Aplica spring security",1,1
,"20210605","20210611");

 





