/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

import java.util.Scanner;

/**
 *
 * @author jared
 */
public class LecturaConsola {

    public static void main(String[] args) {

        int edad = 0;
        Scanner R = new Scanner(System.in);
        String Nombre = "";

        System.out.print("Ingrese su nombre");
        Nombre = R.nextLine();

        System.out.print("Ingrese su edad");
        edad = R.nextInt();

        System.err.println("Nombre: " + Nombre);
        System.err.println("Edad: " + edad);

    }

}
