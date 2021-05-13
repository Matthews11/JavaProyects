/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UJ;

import java.util.Scanner;

/**
 *
 * @author jared
 */
// esto es un objeto creado de la clases persona que contiene sus caracteristicas 
public class obPersona {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        String n, a;
        Persona p1 = new Persona();

        System.out.println("Ingrese su nombre ");
        n = L.nextLine();

        System.out.println("Ingrese su Apellido ");
        a = L.nextLine();

        p1.Nombre = n;
        p1.Apellido = a;

        p1.Mostrar();
    }

}
