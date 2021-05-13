/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

/**
 *
 * @author jared
 */
public class LecturaParametros {

    public static void main(String[] args) {

        String[] Parametro;
        Parametro = new String[2];
        Parametro [0] = "Ejercicio";
        Parametro [1] = "Solucionado";
        
        args = Parametro;
        System.out.println("Parametro 1: " + args[0]);
        System.out.println("Parametro 2: " + args[1]);

    }

}
