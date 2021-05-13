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
 abstract public class PersonaT2 {
    
    private String nombre;
    private String fecha;
    private String DUI;

    public PersonaT2(String nombre, String fecha, String DUI) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.DUI = DUI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDUI() {
        return DUI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }
    
    public void pagar ()
    {
        System.out.println("Se pago le sueldo o articulo");

    }
    
    public void cumpleaños()
    {
        System.out.println("es el cumpleaños del cliente");

    }
    
    
    
}
