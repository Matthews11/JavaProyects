/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www;

/**
 *
 * @author jared
 */
public class p1 {
    
    private int id;
    private String nombre;
    private String apellido;

    public p1() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString()
    {
       return "persona : \n"
               + "id ="+this.id+"\n"
               + "nombre = "+this.nombre+"\n"
               + "apellido ="+this.apellido+"\n";
    }
    
    
}
