/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class SentenciaIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datos="";
        String genero="";
        double sueldo=0, afp=0, isss=0,totalre=0,nsueldo=0,renta=0;
        
        datos=JOptionPane.showInputDialog("Ingrese el sueldo del empleado ");
        sueldo = Double.parseDouble(datos);
       
       genero= (String) JOptionPane.showInputDialog(null,
        "Ingrese el Sexo:\nSi es Masculino (M)\nSi es Femenino (F)",
         "Sexo del Empleado",JOptionPane.QUESTION_MESSAGE,
         null, //Icono por defecto
         new Object[] { "M", "F"},
         "F"); //opcion por defecto
        
        if (sueldo>300)
        {
            afp=(sueldo*0.0625);
        }
        JOptionPane.showMessageDialog(null, "El empleado tiene un sueldo de "+sueldo+"y el descuendo del AFP es "+afp);
        
        
       if(datos == "M")//Si es de sexo Masculino
       {
        isss = sueldo*0.03;
        renta=sueldo*0.10;
        totalre = afp+isss+renta;
        nsueldo = sueldo - totalre;
        JOptionPane.showMessageDialog(null,"A este empleado se le detiene" + isss+ "en concepto de ISSS\nAdemas se le retiene: "+ renta+ "En concepto de Renta\nLo que hace un total de "+
       totalre+ "\nY su nuevo Sueldo es de:"+ nsueldo);
       }
 
    }
    
}
