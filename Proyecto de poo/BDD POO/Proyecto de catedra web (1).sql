Create database POV2
use POV2

create table Usuarios (
	Id_Usuario int AUTO_INCREMENT PRIMARY KEY,
	Nombre_Usuario varchar (50) ,
	IdTipoUsuario int  ,
	IdDepartamento int  ,
    IdEstadoUsuario int  ,
    Contrasena Varchar (50)  
);




create table Tipo_Usuario (
	Id_Tipo_Usuario int AUTO_INCREMENT PRIMARY KEY,
	Tipo_Usuario varchar (50) not null
);

create table Departamento (
	IdDepartamento int AUTO_INCREMENT PRIMARY KEY,
	NombreDepartamento varchar (50) not null
);


  create table Programadores (
	IdProgramador int AUTO_INCREMENT PRIMARY KEY,
	NombreProgramador varchar (50) not null,
	IdUsuarios int not null,
    Edad int not null,
	Correo varchar(50) not null,
    Check (Edad>0 and Edad <50)
);

 
create table EmpleadoAreaFuncional (
	IdEmpleado int AUTO_INCREMENT PRIMARY KEY,
	NombreEmpleado varchar (50) not null,
    IdUsuario int not null,
    Edad int not null,
	Correo varchar(50) not null, 
    Check (Edad>0 and Edad <50)
);


create table Bitacora_Testing (
	IdTesting int AUTO_INCREMENT PRIMARY KEY,
	Observacion varchar (50) ,
    IdCaso int not null,
    IdEmpleado int not null,
    FechaT  date, 
    FechaPuesta date 
);




create table Casos (
	IdCaso int AUTO_INCREMENT PRIMARY KEY,
	DescripcionA varchar (50) ,
    DescripcionJ varchar (50) ,
    IdDepartamento int,
    RazonRechazo varchar (50) ,
    IdEstatoCaso int not null,
    IdProgramador int   ,
    PorcentajeAvance int ,
    IdEmpleado int ,
    IdJefeFuncional int ,
    IdTester int,
    FechaJD  date
    
);



create table EstadoCaso (
	IdEstadoCaso int AUTO_INCREMENT PRIMARY KEY,
	EstadoCaso varchar (50) not null
);



create table Bitacora_Developer (
	IdBitacora int AUTO_INCREMENT PRIMARY KEY,
	Descripcion varchar (50) not null,
    Titulo varchar(50) not null,
    IdProgramador int ,
    IdCaso int not null
); 


alter table Bitacora_Developer 
add constraint foreign key (IdProgramador)references Programadores(IdProgramador)
 ;

alter table Usuarios 
add constraint foreign key (IdDepartamento)references Departamento(IdDepartamento)
 ;

alter table Usuarios 
add constraint foreign key (IdTipoUsuario)references Tipo_Usuario(Id_Tipo_Usuario)
 ;

alter table Programadores 
add constraint foreign key (IdUsuarios)references Usuarios(Id_Usuario)
 ;

alter table EmpleadoAreaFuncional 
add constraint foreign key (IdUsuario)references Usuarios(Id_Usuario)
 ;

alter table Bitacora_Testing 
add constraint foreign key (IdEmpleado)references EmpleadoAreaFuncional(IdEmpleado)
 ;


alter table Bitacora_Testing 
add constraint foreign key (IdCaso)references Casos(IdCaso)
 ;

alter table Bitacora_Developer 
add constraint foreign key (IdCaso)references Casos(IdCaso)
 ;

alter table Casos 
add constraint foreign key (IdEstatoCaso)references EstadoCaso(IdEstadoCaso)
 ;

alter table Casos 
add constraint foreign key (IdProgramador)references Programadores(IdProgramador)
 ;

alter table Casos 
add constraint foreign key (IdDepartamento)references Departamento(IdDepartamento)
 ;
 
 alter table Casos 
add constraint foreign key (IdEmpleado)references EmpleadoAreaFuncional(IdEmpleado)
 ;
 
  alter table Casos 
add constraint foreign key (IdJefeFuncional)references EmpleadoAreaFuncional(IdEmpleado)
 ;
 
   alter table Casos 
add constraint foreign key (IdTester)references EmpleadoAreaFuncional(IdEmpleado)
 ;