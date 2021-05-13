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
public class clase3T {
    private String color;
    private String placa;
    private String cirulacion;

    public clase3T(String color, String placa, String cirulacion) {
        this.color = color;
        this.placa = placa;
        this.cirulacion = cirulacion;
    }

    

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCirulacion(String cirulacion) {
        this.cirulacion = cirulacion;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCirulacion() {
        return cirulacion;
    }
    
    
    
    
}
