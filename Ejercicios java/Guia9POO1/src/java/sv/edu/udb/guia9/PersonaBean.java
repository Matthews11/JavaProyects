/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.guia9;

/**
 *
 * @author jared
 */
public class PersonaBean {

    private String nombre;
    private int edad;

    public PersonaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        if (edad < 40) {
            return "joven";
        }
        return "no joven";
    }

    public boolean getJoven() {
        if (edad < 40) {
            return true;
        }
        return false;
    }
}
