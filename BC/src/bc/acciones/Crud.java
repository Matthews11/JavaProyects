/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bc.acciones;

import bc.modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author jared
 */
public class Crud {

    public String[] ingresar() {

        Scanner leer = new Scanner(System.in);
        Contacto contacto = new Contacto();
        String array[];
        array = new String[10];
        System.out.println("Ingrese su nombre ");
        contacto.setNombre(leer.nextLine());

        System.out.println("Ingrese su telefono ");
        contacto.setTelefono(leer.nextLine());

        array[0] = contacto.getNombre();
        array[1] = contacto.getTelefono();
        System.out.println("Contacto ingresado \n");
        
        listar(array);
        return array;
    }

    public void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
    
     public void eliminar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            
           // array[i].
        } 
    }
     
     public void modificar(String[] array) {
        
         Scanner leer = new Scanner(System.in);
        Contacto contacto = new Contacto();
        String array2[] ;
        array2 = new String[10];
        System.out.println("Ingrese su nombre ");
        contacto.setNombre(leer.nextLine());

        System.out.println("Ingrese su telefono ");
        contacto.setTelefono(leer.nextLine());
        System.out.println("\n");
        array2[0] = contacto.getNombre();
        array2[1] = contacto.getTelefono();
         
         
        for (int i = 0; i < array.length; i++) {
            array[i]=array2[i];
            
            
        } 
         System.out.println("Contacto modificado \n");
        
         listar(array);
    }
     
      public void vaciar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]=null;
        }
          System.out.println("Contacto limpiado \n");
         

    }
 
      public void buscar(String[] array) {
          
        Scanner leer = new Scanner(System.in);
        Contacto contacto = new Contacto();
        String array3[];
        array3 = new String[10];
        System.out.println("Ingrese el nombre para buscar ");
        contacto.setNombre(leer.nextLine());

        System.out.println("Ingrese el telefono para buscar \n");
        contacto.setTelefono(leer.nextLine());
        array3[0] = contacto.getNombre();
        array3[1] = contacto.getTelefono();
        for (int i = 0; i < array.length; i++) {
            
            if(array[i].equals(array3[i])){
                System.out.println(array[i]);
                
            }else {
                System.out.println("no hay datos iguales");
            }
             
        }
        
          
        
    }

}
