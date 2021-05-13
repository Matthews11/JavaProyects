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
public class ClienteT2 extends PersonaT2{

    private String EstadoCredito;
    public ClienteT2(String EstadoCredito, String nombre, String fecha, String DUI) {
        super(nombre, fecha, DUI);
        this.EstadoCredito = EstadoCredito;
    }
    
    public void setEstadoCredito(String estado)
    {
        this.EstadoCredito = estado;
    }
    
    
    public void getEstadoCredito(String estado)
    {
        this.EstadoCredito = estado;
    }
       
    
}
