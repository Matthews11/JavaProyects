/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class Comparacion {
    public static void main(String[] args) {
        
        String PN="";
        String SN="";
        String R ="";
        
        int numero1 =0;
        int numero2 =0;
        
        PN=JOptionPane.showInputDialog("Escriba el primer entero:");
        SN=JOptionPane.showInputDialog("Escriba el primer entero:");
        
        numero1=Integer.parseInt(PN);
        numero2=Integer.parseInt(SN);
        
      if (numero1==numero2) 
      {
            R= numero1 + " == " + numero2;
      }
      
      if (numero1 != numero2)
      {
          R= numero1 + "!="+ numero2;
      }
      
       if (numero1 < numero2)
      {
          R= numero1 + "<"+ numero2;
      }
       
       if (numero1 > numero2)
      {
          R= numero1 + ">"+ numero2;
      }

       if (numero1 <= numero2)
      {
          R= numero1 + "<="+ numero2;
      } 
       
       if (numero1 >= numero2)
      {
          R= numero1 + ">="+ numero2;
      }
        JOptionPane.showConfirmDialog(null,R,"Resultado de la comparacion",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
    
}
