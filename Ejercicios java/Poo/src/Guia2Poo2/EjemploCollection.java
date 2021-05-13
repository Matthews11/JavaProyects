/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author jared
 */
public class EjemploCollection {

    public static void main(String[] args) {

        Collection listaMarcasCoches;
        listaMarcasCoches = new ArrayList<String>();

        // agrega elementos a la coleccion
        listaMarcasCoches.add("audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");

        System.out.println("Numero elementos de eliminar : " + listaMarcasCoches.size()); //obtiene tamaño de collecion
        
        System.out.println("Elementos:"+listaMarcasCoches.toString());
        listaMarcasCoches.remove("Seat");//remueve elemento por nombre
        listaMarcasCoches.remove("Mercedes");
        
        System.out.println("Numero de elementos despues de eliminar seat y mercedes:"+listaMarcasCoches.size());    
        System.out.println("Elementos"+listaMarcasCoches.toString());
    }

}
