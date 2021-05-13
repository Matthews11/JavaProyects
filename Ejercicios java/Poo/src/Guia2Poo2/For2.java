/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Poo2;

/**
 *
 * @author jared
 */
public class For2 {

    public static void main(String[] args) {
         
        // TODO code application logic here
        int Numero[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int Suma = 0;
        //for clasico
        for (int indice = 0; indice < 10; indice++) {
            Suma = Suma + Numero[indice];
        }
        System.out.println("Total con for clasico " + Suma);
        Suma = 0;
        System.out.println("Suma reinicializada vale " + Suma);
        //for mejorado
        for (int valor : Numero) {
            Suma += valor;
        }
        System.out.println("Total con for mejorado " + Suma);
    }

}
