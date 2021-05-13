/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.controls.company.Recursos;

import java.sql.SQLException;
import sv.controls.company.DAO.UsuarioDao;
import sv.controls.company.model.UsuariosBeans;

/**
 *
 * @author jared
 */
public class seleccion2 {
    
    public void eleccion1( int id,
            String Nombre,
            String contra,
            String TU,
            String ES,
            String depa) throws SQLException {

        int tipo;
        int estado;
        int depar;
        UsuariosBeans UB = new UsuariosBeans();
        UsuarioDao PD = new UsuarioDao();
        switch (TU) {
            case "Administrador":

                switch (ES) {
                    case "Activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 1;
                                estado = 1;
                                depar = 1;
                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                                PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 1;
                                estado = 1;
                                depar = 2;
                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 1;
                                estado = 1;
                                depar = 3;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 1;
                                estado = 1;
                                depar = 4;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 1;
                                estado = 1;
                                depar = 5;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 1;
                                depar = 6;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 1;
                                depar = 7;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                    case "No activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 1;
                                estado = 0;
                                depar = 1;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 1;
                                estado = 0;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 1;
                                estado = 0;
                                depar = 3;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 1;
                                estado = 0;
                                depar = 4;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 1;
                                estado = 0;
                                depar = 5;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 0;
                                depar = 6;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 0;
                                depar = 7;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                }

                break;

            case "Jefes de áreas funcionales":

                switch (ES) {
                    case "Activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 2;
                                estado = 1;
                                depar = 1;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 2;
                                estado = 1;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 2;
                                estado = 1;
                                depar = 3;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 2;
                                estado = 1;
                                depar = 4;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 2;
                                estado = 1;
                                depar = 5;
 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 1;
                                depar = 6;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 1;
                                depar = 7;
 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                    case "No activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 2;
                                estado = 0;
                                depar = 1;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 2;
                                estado = 0;
                                depar = 2;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 2;
                                estado = 0;
                                depar = 3;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 2;
                                estado = 0;
                                depar = 4;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 2;
                                estado = 0;
                                depar = 5;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 0;
                                depar = 6;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);
                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 0;
                                depar = 7;

                            
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                }

                break;

            case "Testert":

                switch (ES) {
                    case "Activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 3;
                                estado = 1;
                                depar = 1;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 3;
                                estado = 1;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 3;
                                estado = 1;
                                depar = 3;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                PD.ingresar(UB);

                                break;

                            case "Call center":

                                tipo = 3;
                                estado = 1;
                                depar = 4;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 3;
                                estado = 1;
                                depar = 5;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 1;
                                depar = 6;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 1;
                                depar = 7;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);
                                break;
                        }

                        break;

                    case "No activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 3;
                                estado = 0;
                                depar = 1;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 3;
                                estado = 0;
                                depar = 2;
 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 3;
                                estado = 0;
                                depar = 3;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 3;
                                estado = 0;
                                depar = 4;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 3;
                                estado = 0;
                                depar = 5;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 0;
                                depar = 6;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 0;
                                depar = 7;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);
                                break;
                        }

                        break;

                }

                break;

            case "Jefe de desarrollo":

                switch (ES) {
                    case "Activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 4;
                                estado = 1;
                                depar = 1;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 4;
                                estado = 1;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 4;
                                estado = 1;
                                depar = 3;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 4;
                                estado = 1;
                                depar = 4;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 4;
                                estado = 1;
                                depar = 5;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 1;
                                depar = 6;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 1;
                                depar = 7;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                        }

                        break;

                    case "No activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 4;
                                estado = 0;
                                depar = 1;

                             
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 4;
                                estado = 0;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 4;
                                estado = 0;
                                depar = 3;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 4;
                                estado = 0;
                                depar = 4;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 4;
                                estado = 0;
                                depar = 5;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 0;
                                depar = 6;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 0;
                                depar = 7;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                }

                break;

            case "Programadores":

                switch (ES) {
                    case "Activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 5;
                                estado = 1;
                                depar = 1;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 5;
                                estado = 1;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Finanzas":

                                tipo = 5;
                                estado = 1;
                                depar = 3;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 5;
                                estado = 1;
                                depar = 4;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 5;
                                estado = 1;
                                depar = 5;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);
                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 1;
                                depar = 6;

                              
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 1;
                                depar = 7;

                                 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                    case "No activo":

                        switch (depa) {
                            case "Comunicaciones":
                                tipo = 5;
                                estado = 0;
                                depar = 1;

                              
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Desarrollo":

                                tipo = 5;
                                estado = 0;
                                depar = 2;

                                
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);
                                break;

                            case "Finanzas":

                                tipo = 5;
                                estado = 0;
                                depar = 3;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Call center":

                                tipo = 5;
                                estado = 0;
                                depar = 4;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Jefes":

                                tipo = 5;
                                estado = 0;
                                depar = 5;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;

                            case "Ventas":

                                tipo = 1;
                                estado = 0;
                                depar = 6;
 
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                            case "Tecnologia":

                                tipo = 1;
                                estado = 0;
                                depar = 7;

                               
                                UB.setId_Usuarios(id);
                                UB.setNombre_Usuario(Nombre);
                                UB.setIdTipoUsuario(tipo);
                                UB.setIdDepartamento(depar);
                                UB.setIdEstadoUsuario(estado);
                                UB.setContraseña(contra);

                              PD.modificar(UB);

                                break;
                        }

                        break;

                }

                break;
        }

    }

}

    

