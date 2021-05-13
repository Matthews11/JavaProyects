/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */
public class estudiante {

    HashMap POO = new HashMap<>();
     ArrayList<String> gg = new ArrayList<>();

    public void ingresarEstudiante(String id, String nombre, String interna) {

        
            gg.add(id);
            gg.add(nombre);
            POO.put(interna, gg);
             
            
        }
    

    public void verEstudiante() {

        Set set = POO.entrySet();
        Iterator iterador = set.iterator();

        while (iterador.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterador.next();
            JOptionPane.showMessageDialog(null, "\n Los Datos son:  " + "\n Interna: " + mentry.getKey());
            
             if(!gg.isEmpty()){
           JOptionPane.showMessageDialog(null, "Los elementos son \n");
        for (int i=0; i < gg.size(); i++){
            
            if (i == 0 ){
       JOptionPane.showMessageDialog(null, "el id es: "+gg.get(i));
       
            }
            
            if (i == 1)
            {
                JOptionPane.showMessageDialog(null, "el nombre es: "+gg.get(i));
            }
       
       }
       }
       else{
       JOptionPane.showMessageDialog(null,"NO HAY ELEMENNTOS");
       }
        }

    }

    public void buscarEstudiante(String interna) {

         if (POO.containsKey(interna))
         {
              
          JOptionPane.showMessageDialog(null,"La busqueda finalizo");
          JOptionPane.showMessageDialog(null,"Los datos son");
          verEstudiante();
         }
         else
         {
              JOptionPane.showMessageDialog(null,"No se econtro al estudiante");
         
         }
         
        
        
    }
}
