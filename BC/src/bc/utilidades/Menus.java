/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bc.utilidades;

import bc.acciones.Crud;
import java.util.Scanner;

/**
 *
 * @author jared
 */
public class Menus {

  
    public void menu() {
        
          String array[];
        array = new String[10];
        String salir="";
        Crud crud = new Crud(); 
        Scanner leer = new Scanner(System.in);
        String a;
        do {
        System.out.println("Bienvenido usuario ");
        System.out.println("Que accion desea realizar ? "
                + "\n a. Ingresar"
                + "\n b. Modificar"  
                + "\n c. listar"
                + "\n d. eliminar"
                + "\n e. buscar"
                + "\n f. vaciar");
         a=leer.nextLine();
        
         
        switch (a) {
            case "a":
                
               
                array= crud.ingresar();
                
                break;

            case "b":
                  crud.modificar(array);
                break;
           
            case "c":
                 crud.listar(array);
                break;
                
            case "d":
                crud.eliminar(array);
                break;
            case "e":
                crud.buscar(array);
                
                break;
            case "f":
              crud.vaciar(array);
                break;
            default: 
                System.out.println("Seleccione una accions");
              
                break;

        }
       
               System.out.println("Desea realizar otra operacion Si o No?");
               salir = leer.nextLine();
         }
               while (salir.equals ("si"));

    }

}
