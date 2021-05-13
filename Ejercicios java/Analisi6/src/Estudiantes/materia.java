/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

 
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class materia {
    private int cod_materia;
    private String Nombre;
    private String Descripcion;
  
    public int getCod_materia() {
        return cod_materia;
    }

    public void setCod_materia(int cod_materia) {
        this.cod_materia = cod_materia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
  
    
    
}
