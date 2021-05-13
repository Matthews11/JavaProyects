/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import sun.awt.SunHints;

/**
 *
 * @author jared
 */
public class generador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Calendar fecha = new GregorianCalendar();
       int año = fecha.get(Calendar.YEAR);  
        String años2 = String.valueOf(año);
        String sSubCadena = años2.substring(2,4 );
             System.out.println(sSubCadena);
    }

    
    public void codCaso()
    {
        String sCadena = "Hola Mundo";
        String sSubCadena = sCadena.substring(0,3 );
        System.out.println(sSubCadena);
    }
    
    
    
    
    public void generarCodigo() {
        int Codigo = 0;

        for (int i = 1; i <= 3; i++) {
            Codigo = ((int) (Math.random() * 900 + 100));

        }
        // FUNCION PARA LA TABLA MANDARLE LOS DATOS System.out.println("" + Codigo);

    }

}
