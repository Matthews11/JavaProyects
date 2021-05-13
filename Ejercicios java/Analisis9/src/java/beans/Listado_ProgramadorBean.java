/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author jared
 */
public class Listado_ProgramadorBean {

    private int Id_Progra;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public Listado_ProgramadorBean() {
    }
 
    
    //// <jsp:useBean id="Tester" scope="request" class="beans.Listado_TesterBean">

    public int getId_Progra() {
        return Id_Progra;
    }

    public void setId_Progra(int Id_Progra) {
        this.Id_Progra = Id_Progra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
