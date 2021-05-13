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
public class Listado_TesterBean {
    
    private int id_Tester;
    private String nombre;
    private String apellido;
    private int edad;
    private String correo;

    public Listado_TesterBean() {
        
    }

    public int getId_Tester() {
        return id_Tester;
    }

    public void setId_Tester(int id_Tester) {
        this.id_Tester = id_Tester;
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
